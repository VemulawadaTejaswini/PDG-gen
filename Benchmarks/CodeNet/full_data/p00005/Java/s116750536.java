import java.io.*;

import java.util.*;



class Main{

	private static ArrayList<Integer> calc_gcd_lcm(ArrayList<Integer> a){

		ArrayList<Integer> b = new ArrayList<Integer>();

				

		for(int i = 0;i<a.size()/2;i++){

			

			int x,y;

			if(a.get(i*2) > a.get(i*2+1)){
				x = a.get(i*2);
				y = a.get(i*2+1);
			}
			else{
				x = a.get(i*2+1);
				y = a.get(i*2);
			}
			for(int j=x;j>1;j--){
				if((x % j) == 0 && (y % j) == 0){
					b.add(j);
					break;
				}
			}

			for(int k=x;k<=2000000000;k++){
				if((k % x) == 0 && (k % y) == 0){
					b.add(k);
					break;
				}	
			}

			

			}

		return b;

	}

	private static void print_calc(ArrayList<Integer> a){

		String str1,str2;

		int x,y;

		

		for(int i = 0;i<a.size()/2;i++){	

			

			x = a.get(i*2);

			y = a.get(i*2+1);

			

			System.out.println( x + " " + y );

			

		}

	}

		public static void main(String args[]) throws IOException{

			ArrayList<Integer> val = new ArrayList<Integer>();

			Scanner scan = new Scanner(System.in);

			int n;

			

			while(scan.hasNext()){

					String str1 = scan.next();
					n = Integer.valueOf(str1).intValue(); 

					val.add(n);

			}

						

			

			ArrayList<Integer> res = new ArrayList<Integer>();

			res = calc_gcd_lcm(val);

			print_calc(res);

	}

}