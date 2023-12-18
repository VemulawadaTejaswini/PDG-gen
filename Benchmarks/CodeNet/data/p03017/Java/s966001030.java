import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");

		int N = Integer.parseInt(Ws[0]);
		int A = Integer.parseInt(Ws[1]);
		int B = Integer.parseInt(Ws[2]);
		int C = Integer.parseInt(Ws[3]);
		int D = Integer.parseInt(Ws[4]);

		W = in.readLine();

		char[] S = new char[W.length()+2];
		S[0]='#';
		S[S.length-1]='#';
		for(int i=1;i<S.length-2;i++){
			S[i]=W.charAt(i);
		}
		boolean ans =true;
		String ansS="Yes";
		for(int i=A;i<C-1;i++){
			if(S[i]=='#' && S[i] == S[i+1]){
				ans=false;
				break;
			}
		}
		for(int i=B;i<D-1;i++){
			if(S[i]=='#' && S[i] == S[i+1]){
				ans=false;
				break;
			}
		}

		if(!ans){
			ansS="No";
		}else{

			if(C < D || B >= C){
				ansS="Yes";
			}else{
				ansS="No";
				for(int i=B;i<=D;i++){
					if(S[i]=='.' && S[i]==S[i-1]&&S[i-1] == S[i+1]){
						ansS="Yes";
						break;
					}
				}
			}
		}
		System.out.println(ansS);
	}
}
