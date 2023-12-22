import java.util.*;

import static java.lang.System.exit;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long x=sc.nextLong(),k=sc.nextLong(),d=sc.nextLong();
		long min=Integer.MAX_VALUE;
			for (int i = 0; i < k; i++) {
				long m=Math.min(Math.abs(x-d),Math.abs(x+d));
				x=m;
				min=Math.min(min,m);
              if(min==0) break;
			}
			System.out.println(min);
		}
	}