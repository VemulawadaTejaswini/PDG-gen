import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        String s = sc.next();
        String t = sc.next();
        
        int n = s.length();
        int m = t.length();
        int ans = n;
        for(int i = 0; i <= n-m; i++){
            int count = 0;
            for(int j = 0; j < m; j++){
                if(s.charAt(i+j) != t.charAt(j)){
                    count++;
                }
            }
            ans = Math.min(count, ans);
        }
        System.out.println(ans);
    }
}