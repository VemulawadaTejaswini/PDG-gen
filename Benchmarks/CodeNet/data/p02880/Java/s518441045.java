import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int tmp = 0;
		for(int i = 1; i<10; i++) {
			if(num%i==0) {
				int other = num/i;
				if(other<=9) {
					tmp = 1;
					System.out.println("Yes");
					break;
				}
			}
		}
		
		if(tmp == 0)
			System.out.println("No");
	}
}
