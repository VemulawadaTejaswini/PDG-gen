import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		
		Scanner in = new java.util.Scanner(System.in);
		int D = in.nextInt();
		int T = in.nextInt();
		int S = in.nextInt();
		
		if(T*S >= D) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		in.close();
	}
}
