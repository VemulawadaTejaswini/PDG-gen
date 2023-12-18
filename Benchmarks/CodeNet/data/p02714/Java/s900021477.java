import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int r = 0;
        int g = 0;
        int b = 0;

        for(int i = 0 ; i < s.length() ; i++){
            switch (s.charAt(i)){
                case 'R':
                    r++;
                    break;
                case 'G':
                    g++;
                    break;
                case 'B':
                    b++;
                    break;
            }
        }

        long sum = r*g*b;

        for(int i = 0 ; i < n ; i++){
            for(int d = 1 ; i + 2*d < n ; d++){
                if(s.charAt(i) != s.charAt(i+d) && s.charAt(i+d) != s.charAt(i+2*d) && s.charAt(i+2*d) != s.charAt(i)){
                    sum--;
                }
            }
        }

        System.out.println(sum);
    }
}
