import java.io.*;

import java.util.*;

import java.math.*;



class Main{

	public static void calc_weight(int tw){
		int w=0;
		ArrayList <Integer> out = new ArrayList<Integer>();

		for(int i=9;i>=0;i--){
			if(tw < Math.pow(2,i))continue;
			if(tw-w-Math.pow(2,i) >= 0){
				w += Math.pow(2,i);
				out.add(0,(int)Math.pow(2,i));
			}
			if(tw-w == 0)break;
		}
		for(int i=0;i<out.size();i++){
			if(i != out.size()-1)System.out.print(out.get(i) + " ");
			else System.out.println(out.get(i));
		}
	}

	


	public static void weight(ArrayList<Integer> list){
		for(int i=0;i<list.size();i++){
			calc_weight(list.get(i));	
		}
	}

		

	public static void main(String args[]) throws IOException{

		String str;

		ArrayList <Integer> inp = new ArrayList<Integer>();



		Scanner scan = new Scanner(System.in);

		

		while(scan.hasNext()){

			

			str = scan.next();

			int x = Integer.valueOf(str).intValue();

			inp.add(x);

		}

		weight(inp);

	}

}