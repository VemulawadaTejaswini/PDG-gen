import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < N; i++){
            if ( i == K - 1 ){
                sb.append(Character.toLowerCase(S.charAt(i)));
            } else {
                sb.append(S.charAt(i));
            }
            
        }
        
        System.out.println(sb);
    }
}
