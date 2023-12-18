import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
*/public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		out.close();
	}
static class TaskC   {
public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int M = in.nextInt();
        int[][] d0y = new int[M][3];
        for(int i=0; i<M; i++){
            d0y[i][1] = in.nextInt();
            d0y[i][0] = in.nextInt();
            d0y[i][2] = i;
        }
        String[] ans = new String[M];
        int[] k = new int[N+1];
        Arrays.fill(k, 1);
        Arrays.sort(d0y, Comparator.comparing((int[] a) -> a[0]));
        for(int i=0; i<M; i++){
            StringBuilder temp = new StringBuilder();
            String ken = Integer.toString(d0y[i][1]);
            String num = Integer.toString(k[d0y[i][1]]);
            for(int j=0; j<6-ken.length(); j++) temp.append(0);
            temp.append(ken);
            for(int j=0; j<6-num.length(); j++) temp.append(0);
            temp.append(num);
            ans[d0y[i][2]] = temp.toString();
            k[d0y[i][1]]++;
        }
        for(String a : ans) out.println(a);
    }

}
}

