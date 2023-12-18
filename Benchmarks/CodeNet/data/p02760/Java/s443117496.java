import java.util.Scanner;

//public class atcoder0221_B{
public class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[] A = new int[9];
		String[] Ans = new String[9];
		for(int i=0;i<9;i++) {
				A[i]=scan.nextInt();
//          System.out.println(i+"A："+A[i]);

		}
		for(int i=0;i<9;i++) {
				Ans[i]="false";
		}
		int N = scan.nextInt();
		int[] K = new int[N];
		for(int i=0; i<N;i++) {
			K[i] = scan.nextInt();
//          System.out.println(i+"K："+K[i]);
		}

		String result = "No";

		for(int Kout:K) {
			int i = 0;
			for(int Aout:A) {
				if(Kout==Aout) {
					Ans[i]="true";
				}
				i++;
			}

		}

		if(Ans[0].equals("true")&&Ans[1].equals("true")&&Ans[2].equals("true")
				|| Ans[3].equals("true")&&Ans[4].equals("true")&&Ans[5].equals("true")
				|| Ans[6].equals("true")&&Ans[7].equals("true")&&Ans[8].equals("true")
				|| Ans[0].equals("true")&&Ans[3].equals("true")&&Ans[6].equals("true")
				|| Ans[1].equals("true")&&Ans[4].equals("true")&&Ans[7].equals("true")
				|| Ans[2].equals("true")&&Ans[5].equals("true")&&Ans[8].equals("true")
				|| Ans[0].equals("true")&&Ans[4].equals("true")&&Ans[8].equals("true")
				|| Ans[2].equals("true")&&Ans[4].equals("true")&&Ans[6].equals("true")) {
			result="Yes";
		}

		System.out.println(result);
//      for(String test:Ans){
//      System.out.println(test);
//      }
	}
}