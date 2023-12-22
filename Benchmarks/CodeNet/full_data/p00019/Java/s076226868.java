import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(Calc.fact(n));
	}

}

class Calc {
	public static long fact (int n){
		if(n == 0|| n==1){
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
}