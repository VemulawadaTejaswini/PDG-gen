import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sc = br.readLine();
		int n = Integer.parseInt(sc);
		String line2 = br.readLine();
		String[] str = line2.split(" ");
		int[] x = new int[n];
		for (int i = 0; i<n ; i++ ) {
			x[i] = Integer.parseInt(str[i]);
		}
		for (int i = n-1; i>0 ; i-- ) {
			System.out.print(x[i] + " ");
		}
		System.out.println(x[0]);
	}

}