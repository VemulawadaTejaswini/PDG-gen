import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(int i  = 1; i < 1000; i++) {
			for(int j = -10; j < 1000; j++) {
				long a = (long) Math.pow(i, 5);
				long b = (long) Math.pow(j, 5);
				if(a-b == x) {
					System.out.println(i+" "+j);
					return;
				}
			}
		}
	}
}