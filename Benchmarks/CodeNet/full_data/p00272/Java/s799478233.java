import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[][] a = new int[4][4];
		for(int i = 0; i < 4; i++) {
			a[i][0] = stdIn.nextInt();
			a[i][1] = stdIn.nextInt();
		}
		for(int i = 0; i< 4; i++) {
			switch(a[i][0]) {
			case 1: System.out.println(a[i][1] * 6000);break;
			case 2: System.out.println(a[i][1] * 4000);break;
			case 3: System.out.println(a[i][1] * 3000);break;
			case 4: System.out.println(a[i][1] * 2000);break;
			}
		}
	}
		
}