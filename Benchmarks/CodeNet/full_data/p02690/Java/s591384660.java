import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		boolean flag = false;

		for(int a = -99;a< 100;a++) {
			int sum = a*a*a*a*a - x;
			for(int b = -99;b < 100;b ++) {
				if(sum == b*b*b*b*b) {
					flag = true;
					System.out.println(a+" "+b);
					break;
				}
			}
			if(flag) {
				break;
			}
		}

	}
}