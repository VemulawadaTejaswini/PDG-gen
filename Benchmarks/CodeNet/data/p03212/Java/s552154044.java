import static java.lang.Integer.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		String N = st.nextToken();
		int iN = parseInt(N);
		String[] out = {"0","1","2","4","6","8","9"};
		int count =0;

		int inc = 2;
		label :for(int i=357;i<=iN;i+=inc) {
			String si = String.valueOf(i);
//			System.out.println("文字列 :" + si);
			for(int k=0;k<out.length;k++) {
				if(si.contains(out[k])) {
//					System.out.println("だめ変換まえ:" + i);
					int index = si.indexOf(out[k]);
					int pl = (int)Math.pow((double)10, (double)(si.length()-1 - index));
					i +=  pl;
					i = (int) (Math.floor(i /pl) * pl) -inc;
//					System.out.println("だめ変換後 :" + i);
					continue label;
				}
			}
			if(!(si.contains("7") && si.contains("5") && si.contains("3"))) {
				continue;
			}
//			System.out.println("ans : " +i);
			count ++;
		}
		System.out.println(count);


	}


}
