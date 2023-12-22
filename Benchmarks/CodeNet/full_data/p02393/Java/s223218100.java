import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x[] = new int [3];
		int max,min;
        for(int i = 0; i < 3; i++){
        	x[i] = stdIn.nextInt();
        }
		stdIn.close();

		for (int i = 0; i < x.length - 1; i++) {
            for (int j = i + 1; j < x.length; j++) {
            	max = Math.max(x[i], x[j]);
            	min = Math.min(x[i], x[j]);
            	if (min != x[i]) {
            		x[i] = min;
            		x[j] = max;
            	}
            }
        }
        out_put(x);

	}

	private static void out_put(int array[]){

        System.out.printf("%d", array[0]);

        for(int i = 1; i < array.length; i++){
            System.out.printf(" %d", array[i]);
        }
        System.out.printf("%n");
    }

}

