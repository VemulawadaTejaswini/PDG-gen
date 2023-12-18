import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		long H=scan.nextLong();
		long W=scan.nextLong();

		long[] S = new long[3];
		long amari;


		if(H%3==0||W%3==0){
			System.out.println(0);
		}else{
			if(H<W){
				amari=(W+1)/3;//2→1 3→1 4→1 5→2
				S[0]=H*amari;
				W-=amari;
			}else{
				amari=(H+1)/3;
				S[0]=W*amari;
				H-=amari;
			}

			if(H<W){
				amari=W/2;//2→1 3→1 4→1 5→2
				S[1]=H*amari;
				W-=amari;
				S[2]=W*H;
			}else{
				amari=H/2;
				S[1]=W*amari;
				H-=amari;
				S[2]=W*H;
			}

			Arrays.sort(S);
			System.out.println(S[2]-S[0]);
		}





	}

}
