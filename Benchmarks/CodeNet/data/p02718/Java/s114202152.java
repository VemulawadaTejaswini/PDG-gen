import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt();
        int total = 0;
        int[] votes = new int[n];
        for (int i = 0; i < n; i++) {
            votes[i] = in.nextInt();
            total += votes[i];
        }

        int criteria = total / (4 * m);
        int count = 0;
        for (int vote: votes) {
            if (vote >= criteria)count++;
        }
        
        out.print(count >= m ? "YES": "NO");
        out.close();

    }
}
