import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		int[] nums = new int[10000];
		Scanner sc = new Scanner(System.in);

		do {


	        int x = sc.nextInt();

	        if (x == 0) {
	        	break;
	        }else {
	        	nums[i] = x;
	        }

	        i++;

		}while(true);

		for (int j = 0; nums[j] > 0; j++) {
			System.out.print( "Case "+ (j + 1) +": "+ nums[j] + "\n" );

		}

		sc.close();

	}

}

