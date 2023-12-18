import java.util.*;

public class Main {
	Map<String,String> map = new HashMap<>();
	int N;
	String[] S;
	int cnt = 0;
	String ALPHA ="abcdefghijklmnopqrstuvwxyz";

	Main(int N,String[] S){
		this.N = N;
		this.S = S;

		for(int i=0;i<N;i++){
			cnt++;			//単体は問答無用で追加
			joint(S[i],1,i+1);
		}
		System.out.println(cnt%1000000007);
	}

	private void joint(String str,int m,int n){	//結合文字	結合個数	現在の添え字
		for(int j=n;j<N;j++){
			if(str.indexOf(S[j])==-1){	//結合判定
				cnt++;			//結合出来たらカウントアップして再帰呼び出し
				if(m<N)joint(str+S[j],m+1,j+1);
			}
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();			//N
		String s = sc.next();
		String[] S = s.split("");		//S

		new Main(N,S);
	}
}