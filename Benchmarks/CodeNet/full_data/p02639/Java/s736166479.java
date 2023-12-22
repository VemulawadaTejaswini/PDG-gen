import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] ara = new int[5];
		
		for(int i = 0;i<ara.length;i++) {
			ara[i] = in.nextInt();
			
			if(ara[i] == 0) {
				System.out.println((i+1));
				break;
			}
		}

	}

}
