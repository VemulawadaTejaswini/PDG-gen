import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Double;

public class Main {

	public static void main(String[] args) throws Exception {
		String line = readLine();
		String[] strArray = line.split(" ");
		double[] arrayA = new double[strArray.length];
		for(int i = 0; i < strArray.length; i++){
			arrayA[i] = Double.parseDouble(strArray[i]);
		}

		double tmp = (arrayA[0]*arrayA[1])/2.0;
		System.out.print(String.format("%.4f", tmp) + " ");

		if(arrayA[0]/2 == arrayA[2] && arrayA[1]/2 == arrayA[3]){
			System.out.print("1");
		} else {
			System.out.print("0");
		}
	}


	private static String readLine() throws Exception {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		return br.readLine();
	}
}