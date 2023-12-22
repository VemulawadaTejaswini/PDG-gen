
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author k16069kk
 */
public class Main {

    private static int Culc(int num, int sum) {
        int number[] = new int[num];
        int ans = 0;
        int count = 0;
        
        for (int i = 0; i < number.length; i++) {
            number[i] = i+1;
        }
        
        for (int i = 0; i < num; i++) {
            for (int j = i+1; j < num; j++) {
                for (int k = j+1; k < num; k++) {
                    ans = (number[i] + number[j] + number[k]);
                    if (ans == sum) count++;
                }
            }
        }
        return count;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        int num = 0;
        int sum = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            java.util.StringTokenizer st = new StringTokenizer(line, " ");
            while (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
                sum = Integer.parseInt(st.nextToken());
            }
            if (num == 0 && sum == 0) {
                break;
            }
            System.out.println(Culc(num, sum));
        }
    }
}

