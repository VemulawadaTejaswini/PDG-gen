import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int a = 0;
        int b = 0;
        int c = 0;

        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'a':
                    a++;
                    break;
                case 'b':
                    b++;
                    break;
                case 'c':
                    c++;
                    break;
            }
        }
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);

        System.out.println(max - min < 2 ? "YES" : "NO");;

    }
}
