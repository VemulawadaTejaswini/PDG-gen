import java.io.*;

import java.util.*;

import java.math.*;



class Main{	

		public static void main(String args[]) throws IOException{
			ArrayList<String> inp = new ArrayList<String>();

			

			Scanner scan = new Scanner(System.in);

			String str1 = scan.next();
			String str2;



			BigInteger big_a;
			BigInteger big_b;
			BigInteger big_sum;


			String str_c;



			int n = Integer.valueOf(str1).intValue();

			

			while(scan.hasNext()){

				str1 = scan.next();
				str2 = scan.next();
				big_a = new BigInteger(str1);
				big_b = new BigInteger(str2);
				big_sum = big_a.add(big_b);
				str_c = big_sum.toString();
				if(str_c.length() > 80)System.out.println("overflow");

				else System.out.println(big_sum);

			}



	}

}