import java.io.*;
import java.math.*;

public class Main {
	public static void main(String args[]) throws IOException{
		String str1,str2;
		int i,d = 0;
		BigInteger big1,big2,total;
		
		BufferedReader input =
				new BufferedReader(new InputStreamReader(System.in));
		i = Integer.parseInt(input.readLine());
		while(d++ < i){
			str1 = input.readLine();
			big1 = new BigInteger(str1);
			str2 = input.readLine();
			big2 = new BigInteger(str2);
			total = big1.add(big2);
			if(str1.length() > 80 || str2.length() > 80 ||
				total.toString().length() > 80)
				System.out.println("overflow");
			
			System.out.println(total);
		}
	}
}