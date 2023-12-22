import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] str = br.readLine().split(" ");
			long a = Long.parseLong(str[0]);
			long b = Long.parseLong(str[1]);
			
			long[] ab = new long[2];
			ab[0] = Math.min(a, b);
			ab[1] = Math.max(a, b);
			System.out.println(GCD(ab));
			
		}catch(IOException e){
			System.out.println("IOException");
		}
	}
	
	static long GCD(long[] ab){
		long k;
		while(true){
			k = ab[1]%ab[0];
			if (k==0){
				return ab[0];
			}
			ab[1] = ab[0];
			ab[0] = k;
		}
	}

}