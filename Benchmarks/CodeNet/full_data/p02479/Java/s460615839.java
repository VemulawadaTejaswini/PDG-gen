import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main
 {

	public static void main(String[] args) {
		System.out.println();
		BufferedReader rString = new BufferedReader(new InputStreamReader(System.in));
		try {
		int r=Integer.parseInt(rString.readLine());
		System.out.println(r*r*Math.PI+" "+r*2*Math.PI);
		}
		catch (IOException e) {
			 System.out.println(e);
		}

		catch (NumberFormatException e) {
			System.out.println("");

			}
	}

}