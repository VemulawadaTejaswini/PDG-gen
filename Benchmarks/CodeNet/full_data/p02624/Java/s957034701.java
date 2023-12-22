import java.io.*;
import java.util.*;
class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(reader.readLine());
		long res = 0;
		for(long i = 1;i<=n;i++){
			long p = n/i;
			res += ((p*(p+1))*i)/2;
		}
		System.out.println(res);
		 
		}
}
