import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int k = sc.nextInt();

		int count =1;
		for(int i =1 ;  count <= k ;count++) {
			if(a>0) {
				a -=i;
			}else if(b>0) {
				b -=i;
			}else {
				break;
			}

		}
		System.out.println(a + " " + b);
	}
}

