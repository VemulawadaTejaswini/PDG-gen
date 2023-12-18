import static java.lang.Integer.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static String N;
	public static long Ni;
	public static long count =0L;
	public static long[] i753 = {3L,5L,7L};
	public static List<Long> l753 = new ArrayList<Long>(){
	    {
	        add(3L);
	        add(5L);
	        add(7L);
	    }
	};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = st.nextToken();
		Ni = parseInt(N);


		make753List();

		for(long v : l753) {
			String si = String.valueOf(v);
			if(si.contains("7") && si.contains("5") && si.contains("3")) {
				count++;

			}
		}
		System.out.println(count);


	}

	public static void make753List() {
		label : for(int i=0;i<l753.size();i++) {
			for(int k=0;k<i753.length;k++) {
				long num = l753.get(i) * 10 + i753[k];
				if(num <= Ni) {
					l753.add(num);
				}else {
					break label;
				}
			}
		}
	}

}
