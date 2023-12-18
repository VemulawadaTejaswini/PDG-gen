
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] as = br.readLine().split(" ");
		int a = Integer.parseInt(as[0]);
		int b = Integer.parseInt(as[1]);
		int pStart = b*10;
		int pEnd = b*20;
		int result = -1;
		for(int i = pStart ; i< pEnd ;i++) {
			if( a / 0.08 <= i && i <= (a/0.07)+1) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}

}
