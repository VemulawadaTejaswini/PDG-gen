import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int D = sc.nextInt();
		int x2000 = sc.nextInt();
		
		for(int i = 1; i <= 10; i++){
			x2000 = r * x2000 - D;
			System.out.println(x2000);
		}
	}
}