
import java.util.*;

/**
 * A
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int[] A = new int[H];

        for(int i=0; i<H; i++) {
            A[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 1; i <= H; i++) {

            StringBuilder sb = new StringBuilder();
            sb.append("node ").append(i).append(": key = ").append(A[i-1]).append(", ");

            if(i != 1) {
                sb.append("parent key = ").append(A[i/2-1]).append(", ");
            }

            if(i*2 <= H) {
                sb.append("left key = ").append(A[i*2-1]).append(", ");
            }

            if(i*2+1 <= H) {
                sb.append("right key = ").append(A[i*2]).append(", ");
            }

            System.out.println(sb);

        }

    }
}
