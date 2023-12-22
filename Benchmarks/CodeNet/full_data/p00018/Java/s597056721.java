import java.io.*;
import java.util.*;

class Main{
	
		public static String sort_a (String a){
			String b ="";
			ArrayList<Integer> calc = new ArrayList<Integer>();
			
			String[] strAry = a.split(" ");
			
			for(int i=0;i<strAry.length;i++){
				calc.add(Integer.valueOf(strAry[i]).intValue());
			}
			
			for(int i = 0;i<calc.size();i++){
				for(int j=calc.size()-1;j>i;j--){
					if(calc.get(j) > calc.get(j-1)){
						int t = calc.get(j);
						calc.set(j,calc.get(j-1));
						calc.set(j-1,t);
					}
				}
			}
			for(int i=0;i<calc.size();i++){
				if(i != calc.size()-1)
					b += (calc.get(i)+" ");
				else b += (calc.get(i));
			}
			
			return b;
		}
				
		public static void main(String args[]) throws IOException{
			String str;

			ArrayList<String> inp = new ArrayList<String>();
			ArrayList<String> buf = new ArrayList<String>();
			ArrayList<String> out = new ArrayList<String>();

			Scanner scan = new Scanner(System.in);

			scan.useDelimiter("\n");

			
			while(scan.hasNext()){
				str = scan.next();
				inp.add(str);
			}
			
			String str1;
			for(int i=0;i<inp.size();i++){
				str1 = (String)inp.get(i);
				str1 = sort_a(str1);
				out.add(str1);
			}
			
			
			for(int i=0;i<out.size();i++){
				System.out.println(out.get(i));
			}
	}
}