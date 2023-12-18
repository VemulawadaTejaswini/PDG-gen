import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static long H;
	static long W;
	static long[] S= new long[3];

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		H=scan.nextLong();
		W=scan.nextLong();

		long s=1000000;

		s=Math.min(s, minimum(true,H/3,true,H,W));
		s=Math.min(s, minimum(true,(H+1)/3,true,H,W));
		s=Math.min(s, minimum(true,(H+2)/3,true,H,W));
		s=Math.min(s, minimum(true,H/3,false,H,W));
		s=Math.min(s, minimum(true,(H+1)/3,false,H,W));
		s=Math.min(s, minimum(true,(H+2)/3,false,H,W));

		s=Math.min(s, minimum(false,W/3,true,H,W));
		s=Math.min(s, minimum(false,(W+1)/3,true,H,W));
		s=Math.min(s, minimum(false,(W+2)/3,true,H,W));
		s=Math.min(s, minimum(false,W/3,false,H,W));
		s=Math.min(s, minimum(false,(W+1)/3,false,H,W));
		s=Math.min(s, minimum(false,(W+2)/3,false,H,W));

		System.out.println(s);



	}

	static long minimum(boolean h,long X,boolean h2,long H,long W){


		if(h){
			S[0]=X*W;
			H-=X;
			if(h2){
				long H_=H/2;
				S[1]=W*(H_);
				H-=H_;
				S[2]=W*H;
			}else{
				long W_=W/2;
				S[1]=H*W_;
				W-=W_;
				S[2]=W*H;
			}


		}else{
			S[0]=X*H;
			W-=X;
			if(h2){
				long H_=H/2;
				S[1]=W*(H_);
				H-=H_;
				S[2]=W*H;
			}else{
				long W_=W/2;
				S[1]=H*W_;
				W-=W_;
				S[2]=W*H;
			}
		}

		Arrays.sort(S);
		return S[2]-S[0];


	}

}
