import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Main {

	 private static final int A = 0;
	    private static final int B = 1;
	    private static final int C = 2;
	    private static final int D = 3;
	    private static final int E = 4;
	    private static final int F = 5;


	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str ;
		String[] num1 = null;

		try {


		while ((str = br.readLine()) !=null) {


		 num1 = str.split(" ");

		BigDecimal[] array = new BigDecimal[num1.length] ;


		for(int i=0; i<num1.length; i++){
			array[i] = new BigDecimal(num1[i]);
		}


		BigDecimal x= (array[C].multiply(array[E]).subtract(array[B].multiply(array[F])).divide(array[A].multiply(array[E]).subtract(array[B].multiply(array[D]))));

		BigDecimal y= (array[C].multiply(array[D]).subtract(array[A].multiply(array[F])).divide(array[B].multiply(array[D]).subtract(array[A].multiply(array[E]))));

		System.out.println(x.setScale(3, RoundingMode.HALF_UP)+" "+y.setScale(3, RoundingMode.HALF_UP));

		}

		} catch (Exception e) {
			// TODO: handle exception
		}


	}

}