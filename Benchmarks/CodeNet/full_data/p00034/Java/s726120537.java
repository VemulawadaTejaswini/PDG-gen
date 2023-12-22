import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main{

	public static void calc_railway(ArrayList<Integer> list){
		double x=0,l=0,v1,v2,ln=0;
		
		for(int i=0;i<10;i++){
			l += (double)list.get(i);
		}
		v1 = (double)list.get(10);
		v2 = (double)list.get(11);
		
		x = (v1*l)/(v1+v2);
		
		for(int i=0;i<10;i++){
			ln += list.get(i);
			if(ln >= x){System.out.println(i+1); break;}
		}
	}
	

	public static void rail_way(ArrayList<Integer> list){
		ArrayList <Integer> inp = new ArrayList<Integer>();
		
		for(int i=0;i<list.size()/12;i++){
			for(int j=0;j<12;j++){
				inp.add(list.get(i*12+j));
			}
			calc_railway(inp);
			inp.clear();
		}

	}
		
	public static void main(String args[]) throws IOException{
		String str;
		ArrayList <Integer> inp = new ArrayList<Integer>();

		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()){
			str = scan.next();
			String [] strAry = new String[str.length()];
			strAry = str.split(",");
			for(int j=0;j<strAry.length;j++){
				Pattern p = Pattern.compile("[0-9]*");
				Matcher m = p.matcher(strAry[j]);
				if(m.find()){
					int x = Integer.valueOf(m.group(0)).intValue();
					inp.add(x);
				}
			}
		}
		rail_way(inp);
	}
}