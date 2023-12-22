
import java.text.DecimalFormat;
import java.util.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main {
	
	void run() {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			int v = sc.nextInt();
			int l = sc.nextInt();
			if((v|l) == 0) break;
			String fmt = "";
			for(int i=0;i<l;i++) fmt += "0";
			DecimalFormat dc = new DecimalFormat(fmt);
			
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			map.put(v, 0);
			
			int s=0, ans = -1, c=1;
			for(;;c++) {
				String val = dc.format(v);
				int[] ar = new int[l];
				for(int i=0;i<l;i++) ar[i] = val.charAt(i)-'0';
				sort(ar);
				String max = "";
				String min = "";
				for(int i=0;i<l;i++) {
					min += "" + ar[i];
					max += "" + ar[l-i-1];
				}
				int maxI = Integer.valueOf(max), minI = Integer.parseInt(min);
//				debug(maxI, minI);
				v = maxI - minI;
				
				if(map.containsKey(v)) {
					s = map.get(v);
					ans = v;
					break;
				}
				else {
					map.put(v, c);
				}
//				debug(v, c);
			}
			System.out.println(s + " " + ans + " " + (c-s));
		}
	}
	
	void debug(Object... os  ) {
		System.err.println(deepToString(os));
	}
	
	public static void main(String[] args ) {
		new Main().run();
	}
}