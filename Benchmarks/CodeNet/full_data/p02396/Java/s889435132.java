import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = 1;
		int x = 100;
		while(true){
			x = sc.nextInt();
			if (x == 0){
				break;
			} else{
				System.out.println("Case " + i + ":" + x);
				i++;
			}
		}
	}

}