import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int[] S ;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");
		int N = Integer.parseInt(Ws[0]);
		int M = Integer.parseInt(Ws[1]);

		String[] S = new String[(int)Math.pow(10, N)];
		for(int i=0;i<S.length;i++){
			S[i] = String.valueOf(i);
		}

		String[][] Q = new String[M][];
		for(int i=0;i<M;i++){
			W = in.readLine();
			Q[i] = W.split(" ");
		}

		int i = (int)Math.pow(10, M-1);
		int end = i*10;
		for(;i<end;i++){
			boolean flg = true;
			for(int k = 0;k<Q.length;k++){
				if(S[i].length() < Integer.parseInt(Q[k][0]) || S[i].charAt(Integer.parseInt(Q[k][0])-1) != Q[k][1].charAt(0)){
					flg= false;
					break;
				}
			}
			if(flg){
				break;
			}
		}
		if(i==end){
			System.out.println(-1);
		}else{
			System.out.println(S[i]);
		}
	}


}
