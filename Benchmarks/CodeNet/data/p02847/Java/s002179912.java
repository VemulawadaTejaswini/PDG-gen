import java.util.*;
import java.math.*;
import java.io.*;

public class cf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final Map<String, Integer> cnt = Map.of(
            "SUN", 7,
            "MON", 6,
            "TUE", 5,
            "WED", 4,
            "THU", 3,
            "FRI", 2,
            "SAT", 1
        );


        String s = in.next();
        out.println(cnt.get(s));

        in.close();
        out.close();
    }
    static class Pair {
	  		public long first;
	  		public long second;

	  		public Pair() {
	  			this(0, 0);
	  		}

	  		public Pair(final long first, final long second) {
	  			this.first = first;
	  			this.second = second;
	  		}
	  	}
}
