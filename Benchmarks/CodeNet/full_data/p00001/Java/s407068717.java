import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		int[] x = new int[10];

		for(int i =0; i < x.length; i++ ) {


			x[i] = stdin.nextInt();

		}

		int n = 0;
		n = 10;
		int buble =n*(n-1)/2;
		for(int i = 0; i < buble; i++){

		    for(int j = 0; j < n - 1; j++){

		    	if(x[j] < x[j + 1]) {

		    		int temp = x[j];
		    		x[j] = x[j + 1];
		    		x[j + 1] = temp;

		    	}

		    }

	   }

		for(int i = 0; i < 3; i++) {

			System.out.println(x[i]);

		}

	}


}