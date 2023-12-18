import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] sp = S.split("");
        int N = sp.length;
        int count = 0;

        for(int i = 0; i < N; i++) {
            long a = 0;
            for(int j = i + 4; j <= N; j++) {
                a = Long.parseLong(S.substring(i,j));
                if(a % 2019 == 0) {
                    count++;
                }
                
            }
            
        }
        
        System.out.println(count);
        
        
    }
}