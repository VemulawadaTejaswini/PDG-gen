import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main{
	
		public static String sort_a (String a){
			String b ="";
			ArrayList<Integer> calc = new ArrayList<Integer>();
			
			String [] strAry = new String[a.length()];
			strAry = a.split(" ");
			
			
			for(int i=0;i<strAry.length;i++){
				Pattern p = Pattern.compile("[0-9]*");
				Matcher m = p.matcher(strAry[i]);
				if(m.find()){
					int x = Integer.valueOf(m.group(0)).intValue();
					calc.add(x);
				}
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
			ArrayList<String> out = new ArrayList<String>();

			Scanner scan = new Scanner(System.in);
			//scan.useDelimiter("\n");
			
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