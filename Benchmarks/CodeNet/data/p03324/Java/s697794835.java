import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int D = in.nextInt();
		int N = in.nextInt();
	
		
		if(D==0) {
			if(N==100) {
				System.out.print(N+1);
			}else {
				System.out.print(N);
			}
		}else if(D==1) {
			if(N==100) {
				System.out.print(100*(N+1));
			}else {
				System.out.print(100*N);
			}
		}else if(D==2) {
			if(N==100) {
				System.out.print(100*100*(N+1));
			}else {
				System.out.print(100*100*N);
			}
		}
		in.close();
		
	}
}