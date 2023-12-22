import java.io.*;

import java.util.*;
import java.math.*;



class Main{

	private static int sum_check(int a){

		int count = 0;
		boolean ch;

		if(a == 2) count = 1;
		else{

			for(int i = 2;i<=a;i++){
				ch = false;
				if(i%2 != 0){
					for(int j = i-1;j>=Math.sqrt(i);j--){
						if((i%j) == 0) {ch = true;break;}
					}
					if(ch == false)count++;
				}

			}
			count++;
		}		

		return count;

	}

	

		public static void main(String args[]) throws IOException{

			Scanner scan = new Scanner(System.in);

			int n,count;

			ArrayList<Integer> res = new ArrayList<Integer>();


			while(scan.hasNext()){

				String str1 = scan.next();

				n = Integer.valueOf(str1).intValue();

				res.add(sum_check(n));

			}
			for(int i = 0;i<res.size();i++){
				System.out.println(res.get(i));
			}

		}

}