import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		for(int i = 0 ; i < 5 ; i++) {
			n++;
			if(sc.nextInt() == 0) {
				System.out.println(n);
			}
		}
	}


}

