import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String readStr = in.readLine();

		int N = Integer.parseInt(readStr.split(" ")[0]);
		int Q = Integer.parseInt(readStr.split(" ")[1]);


		readStr = in.readLine();
		String[] S = new String[N+2];
		for(int i=0;i<N;i++){
			S[i+1] = String.valueOf(readStr.charAt(i));
		}
		int[] G = new int[N+2];
		Arrays.fill(G,1);

		String[] command ;
		for(int i=0;i<Q;i++){
			command = in.readLine().split(" ");
			if("R".equals(command[1])){
				for(int k = N; k>=1;k--){
					if(S[k].equals(command[0])){
						G[k+1]+=G[k];
						G[k]=0;
					}
				}
			}else{
				for(int k = 1; k<N;k++){
					if(S[k].equals(command[0])){
						G[k-1]+=G[k];
						G[k]=0;
					}
				}
			}
		}

		int ans = 0;
		for(int i=1;i<N+1;i++){
			ans+=G[i];
		}

		System.out.println(ans);
	}


}
