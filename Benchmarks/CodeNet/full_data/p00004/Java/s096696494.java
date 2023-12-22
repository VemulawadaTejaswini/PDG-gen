import java.io.*;

import java.util.*;

import java.math.BigDecimal;

import java.text.DecimalFormat;





class Main{

	private static ArrayList<Double> calc_equ(ArrayList<Double> a){

		ArrayList<Double> b = new ArrayList<Double>();

		

		int s = a.size()/6;

				

		for(int i = 0;i<s;i++){

			

			Double x,y,a1,b1,c1,d1,e1,f1;

			x = 0.0;

			y = 0.0;



			a1 = a.get(i*6);

			b1 = a.get(i*6+1);

			c1 = a.get(i*6+2);

			d1 = a.get(i*6+3);

			e1 = a.get(i*6+4);

			f1 = a.get(i*6+5);

						

			y = (a1*f1-c1*d1)/(e1*a1-b1*d1);

			x = (c1-b1*y)/a1;

			

			b.add(x);

			b.add(y);

			}

		return b;

	}

	private static void print_calc(ArrayList<Double> a){

		String format = "0.000";

		DecimalFormat decimalFormat = new DecimalFormat( format );

		

		String str1,str2;

		double x,y;

		

		for(int i = 0;i<a.size()/2;i++){	

			

			x = a.get(i*2);

			y = a.get(i*2+1);

			

			str1 = Double.toString(x);

			str2 = Double.toString(y);

			

			BigDecimal bigDecimal1 = new BigDecimal( str1 );

			BigDecimal bigDecimal2 = new BigDecimal( str2 );

			

			BigDecimal Result1 = bigDecimal1.setScale(4,BigDecimal.ROUND_HALF_UP);

			BigDecimal Result2 = bigDecimal2.setScale(4,BigDecimal.ROUND_HALF_UP);

			

			System.out.println( decimalFormat.format( Result1 ) + " " + decimalFormat.format( Result2 ) );

			

		}

	}

		public static void main(String args[]) throws IOException{

			ArrayList<Double> equ = new ArrayList<Double>();

			Scanner scan = new Scanner(System.in);

			Double n;

			

			while(scan.hasNext()){

					String str1 = scan.next();

					n = Double.parseDouble(str1);

					equ.add(n);



			}

						

			

			ArrayList<Double> res = new ArrayList<Double>();

			res = calc_equ(equ);

			print_calc(res);

	}

}