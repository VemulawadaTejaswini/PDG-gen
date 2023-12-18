import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");

		int a = Integer.parseInt(Ws[0]);
		int b = Integer.parseInt(Ws[1]);

		String A="";
		String B="";

		for(int i=0;i<b;i++){
			A+=a;
		}

		for(int i=0;i<a;i++){
			B+=b;
		}
		String ans;
		if(A.compareTo(B) <=0){
			ans=A;
		}else{
			ans=B;
		}

		System.out.println(ans);



	}


}
