import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c,sum = 0;
		int[] d = new int[100];
		a = scan.nextInt();
		b = scan.nextInt();
		
		for(int i = 0; i < b; i++) {
			sum += scan.nextInt();
		}
		if(sum % (a + 1) == 0) c = sum / (a + 1);
		else c = sum / (a + 1) + 1;
		
		System.out.println(c);
	}
}
