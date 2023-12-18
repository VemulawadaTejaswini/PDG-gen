import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int D = in.nextInt();
		int N = in.nextInt();
		if(D==0) {
			System.out.print(N);
		}else if(D==1) {
			System.out.print(100*N);
		}else if(D==2) {
			System.out.print(100*100*N);
		}
		in.close();
		
	}
}