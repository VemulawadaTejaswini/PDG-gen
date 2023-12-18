import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int K = sc.nextInt();
        int X = sc.nextInt();
        
        int start = X - K + 1;
        int end = X + K - 1;
        
        StringBuilder sb = new StringBuilder();
        for(int i = start; i <= end; i++){
            sb.append(i);
            if ( i != end ) sb.append(" ");
        }
        
        System.out.println(sb);
        
    }
}
