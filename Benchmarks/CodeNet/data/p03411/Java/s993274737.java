import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author kazu
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String[] ab = new String[N];
        for(int i=0;i<N;i++){
            ab[i] = sc.next() + sc.next();
        }
        Arrays.sort(ab);
        String[] dc = new String[N];
        for(int i=0;i<N;i++){
            String c = sc.next();
            String d = sc.next();
            dc[i] = d + c;
        }
        Arrays.sort(dc);
        
        int count = 0;
        
        for(int i=N-1;i>-1;i--){
            int a = Integer.parseInt(String.valueOf(ab[i].charAt(0)));
            int b = Integer.parseInt(String.valueOf(ab[i].charAt(1)));
            for(int j = 0; j<N ;j++){
                int d = Integer.parseInt(String.valueOf(dc[j].charAt(0)));
                int c = Integer.parseInt(String.valueOf(dc[j].charAt(1)));
                if( a < c && b < d){
                    count++;
                    dc[j] = "00";
                    break;
                }
            }
        }
        
        System.out.println(count);
    }
}