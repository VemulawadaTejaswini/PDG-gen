import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] An = new int [N];
		int i = 0;
		long product = 1;
		for(i = 0; i<An.length; i++) {
			An[i] = sc.nextInt();
		} 
		for (i = 0; i<An.length; i++) {
			product *= An[i];	
          System.out.println(product);
		}
		if (product>=1e18) {
			System.out.println(-1);
		}else {
			System.out.println(product);
		}
	}

}
