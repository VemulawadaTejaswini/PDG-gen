import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int r = 0;
        int g = 0;
        int b = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'R'){r++;}
            else if(s.charAt(i) == 'G'){g++;}
            else{b++;}
        }
        int ans = r * g * b;
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n; j++){
                int k = 2 * j - i;
                if(k >= n) break;
                if(s.charAt(i) != s.charAt(j) && s.charAt(i) != s.charAt(k) && s.charAt(k) != s.charAt(j)) ans--;
            }
        }
        System.out.println(ans);
    }
}
