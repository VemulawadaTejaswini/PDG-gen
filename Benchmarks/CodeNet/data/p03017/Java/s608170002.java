import java.util.Scanner;

public class Main{

	static boolean ans = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		String t = sc.next()+"________";
		sc.close();
		char[] S = t.toCharArray();

		Main m = new Main();

		m.search(A-1,B-1,S,C-1,D-1);
		if(ans) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}
	void search(int posA,int posB,char[] S,int C,int D){

		if(posA==C&&posB==D) {
			ans = true;
			//System.out.println("true;");
			return;
		}else if(S[posA]=='_' || S[posB]=='_') {
			//System.out.println("SposSposb");
			return;
		}else {
			//System.out.println("else");
			if(posA<=C&&posB<=D){
				//System.out.println("ifA");
				if(S[posA+1]!='#' && posA+1!=posB){
					//System.out.println("0");
					search(posA+1,posB,S,C,D);
				}
				if(S[posA+2]!='#' && posA+2!=posB){
					search(posA+2,posB,S,C,D);
				}
				if(S[posB+1]!='#' && posB+1!=posA){
					search(posA,posB+1,S,C,D);
				}
				if(S[posB+2]!='#' && posB+2!=posA){
					search(posA,posB+2,S,C,D);
				}
				return;
			}else {
				return;
			}
		}
	}
}