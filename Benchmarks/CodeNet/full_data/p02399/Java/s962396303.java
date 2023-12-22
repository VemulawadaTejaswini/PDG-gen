import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ABProblem {
	public static void main( String[] args ) {
		try {
			BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
			String tmp = br.readLine();
			String[] undevidedNumbers = tmp.split(" ");
			int[] inputNumbers = new int[2];
			inputNumbers[0] = Integer.parseInt(undevidedNumbers[0]);
			inputNumbers[1] = Integer.parseInt(undevidedNumbers[1]);

			int devidedInteger = inputNumbers[0] / inputNumbers[1];
			int rest = inputNumbers[0] % inputNumbers[1];
			double devidedDouble = ( (double) inputNumbers[0] / inputNumbers[1] );



			if(inputNumbers[0] >= 1 && inputNumbers[1] <= 1000000000) {
				System.out.print  (devidedInteger + " ");
				System.out.print  (rest + " ");
				System.out.println( devidedDouble);
			}
		} catch ( IOException e ) {
			e.printStackTrace();
		}
	}
}