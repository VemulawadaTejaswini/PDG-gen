import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		
		do {
			int x = 1;
			if (x % 3 == 0) {
				System.out.print(" "+i);
			}else{
				do{
					if (x % 10 == 3) {
						System.out.print(" "+i);
					}else{
						x /= 10;
					}
				}while(x != 0);
			}
		}while(++i <= 0);
		System.out.println();	
	}
}