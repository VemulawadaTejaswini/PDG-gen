import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int k = stdIn.nextInt();
		
		if(k>= b-a+1) {
			for(int i = a; i<=b;i++) {
				System.out.println(i);	
			}
			System.exit(0);
		}
		if(Math.ceil((int)((b-a+1)/2)) <= k){
			for(int i = a; i<=b;i++) {
				System.out.println(i);	
			}
			System.exit(0);
		
		}
		
		for(int i = a; i <a+k;i++) {
			System.out.println(i);
		}
		for(int i = b-k+1; i <= b; i++) {
			System.out.println(i);
		}
		
		
		
	}

}
