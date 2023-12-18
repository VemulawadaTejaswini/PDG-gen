
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String t = br.readLine();

		List<Integer> S = new ArrayList<Integer>();
		List<Integer> T = new ArrayList<Integer>();

		for(int i = 0;i<t.length();i++){
			T.add((int)t.charAt(i));
		}

		int insert = -1;	//番地
		int cnt = 0;

		for(int i = 0;i<s.length();i++){
			int now = (int)s.charAt(i);
			S.add(now);

			if(now == 63){
				cnt++;
			}else{
				boolean flag = true;
				int base_cnt = cnt;
				for(int j = 0;j<=Math.min(base_cnt, T.size()-1);j++){
					if(now == T.get(j)){
						cnt = j+1;
						flag = false;
					}
				}
				if(flag)cnt = 0;
				else if(cnt>=T.size()){
					//TODO:ここに先に入っちゃうのが問題
					insert = i - T.size();
					cnt = 0;
				}
			}
		}

		if(cnt>=T.size()){
			insert = s.length() - T.size() ;
			cnt = 0;
		}

		if(insert == -1){
			System.out.println("UNRESTORABLE");
			System.exit(0);
		}

		for(int i = insert;i<Math.min(insert+T.size(),S.size());i++){
			S.set(i,T.get(i-insert));
		}

		for(int i = 0;i<S.size();i++){
			if(S.get(i) == 63)S.set(i,97);
		}

		byte[] ascii = new byte[S.size()];

		for(int i = 0;i<S.size();i++){
			ascii[i] = Byte.parseByte(String.valueOf(S.get(i)));
		}


		String resultString;
	    try {
	    	resultString = new String(ascii, "US-ASCII");
	        } catch (Exception e) {
	        	e.printStackTrace();
	        	return;
	        }

		System.out.println(resultString);
		//TODO:全部aに置き換える

		/*
		 * ??cd??cd
		 * acd
		 * aacacdcd
		 */

	}

}
