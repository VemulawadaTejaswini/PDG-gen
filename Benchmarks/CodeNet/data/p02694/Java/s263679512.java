import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt(),cost=100;
		for(int i=0;;i++) {
			cost*=1.01;
			if(cost>=x) {
				System.out.println(i);
				break;
			}
		}
	}
}