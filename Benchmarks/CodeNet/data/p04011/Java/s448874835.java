import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[] ) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String in1 = br1.readLine();
		int n = Integer.parseInt(in1);
		in1 = br1.readLine();
		int k = Integer.parseInt(in1);
		in1 = br1.readLine();
		int x = Integer.parseInt(in1);
		in1 = br1.readLine();
		int y = Integer.parseInt(in1);
		
		int sum1 = (n-k)*y;
		int sum2 = k*x;
		System.out.println(sum1+sum2);
	}

}
