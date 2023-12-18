import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		for(int i = 0; i < n; i++) {
			if((int)Math.floor(i*1.08) == n) {
				System.out.println(i);
				System.exit(0);
			}else {
				continue;
			}
		}
		System.out.println(":(");
		
	}

}
