import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		int box = 0;
		
		for(int i = 1;i<6;i++) {
			a = scan.nextInt();
			if(a==0) {
				box = i;
			}
		}
		System.out.print(box);
	}

}