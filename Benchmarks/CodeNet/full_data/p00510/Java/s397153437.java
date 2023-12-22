import java.util.*;

import javax.xml.crypto.Data;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean Er = false;
		int max = m;
		for(int i = 0; i < n; i++) {
			int in = sc.nextInt();
			int out = sc.nextInt();
			m += in;
			m -= out;
			max = Math.max(m, max);
			if(m < 0) Er = true;
		}
		if(Er) {
			System.out.println(0);
		}
		else {
			System.out.println(max);
		}
	}


}