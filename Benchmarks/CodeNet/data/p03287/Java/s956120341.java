import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
*/public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}
static class TaskD   {
public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int M = in.nextInt();
        long s[] = new long[N+1];
        for (int i=0; i<N; i++) {
            s[i+1] = s[i] + in.nextLong();
        }
        long ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i=1; i<=N; i++) {
            int yo = (int)(s[i] % M);
            if (yo == 0){
                if(!hm.containsKey(yo)){
                    hm.put(yo, 1);
                    ans+=1;
                }
                else {
                    int m = hm.get(yo);
                    hm.put(yo, m+1);
                    ans+=m+1;
                }
            }
            else{
                if(!hm.containsKey(yo)) hm.put(yo, 1);
                else {
                    int m = hm.get(yo);
                    hm.put(yo, m+1);
                    ans+=m;
                }
            }
        }
        out.println(ans);
    }

}
}

