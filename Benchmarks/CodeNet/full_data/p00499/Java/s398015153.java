import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 float[] A = new float[5];
		 for(int i = 0 ; i < 5 ; i++){
			 A[i] = Float.parseFloat(br.readLine());
		 }
		 System.out.println((int)A[0] - (int) Math.max(Math.ceil(A[1] / A[3]),Math.ceil(A[2] / A[4])));
	}
}