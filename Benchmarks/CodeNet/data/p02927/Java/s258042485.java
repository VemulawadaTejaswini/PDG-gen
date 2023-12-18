import java.util.*;
import java.math.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int m = in.nextInt();
        int d = in.nextInt();

        int ans = 0;
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= d; ++j) {
                if (j / 10 >= 2 && j % 10 >= 2  && (j / 10) * (j % 10) == i) {
                    //out.println(i + " " + j);
                    ans++;
                }
            }
        }
        out.println(ans);

        in.close();
        out.close();
    }
    static class Pair {
	  		public int first;
	  		public int second;

	  		public Pair() {
	  			this(0, 0);
	  		}

	  		public Pair(final int first, final int second) {
	  			this.first = first;
	  			this.second = second;
	  		}
	  	}
}
