import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		int d = (N-1)/(K-1);
		int e = (N-1)%(K-1);
		if(e == 0) {
			System.out.print(d);		
		}else {
			System.out.print(d+1);
		}
		
		in.close();
		
	}
}