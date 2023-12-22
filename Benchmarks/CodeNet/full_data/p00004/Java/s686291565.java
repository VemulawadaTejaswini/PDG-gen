import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main{
	//for(Map.Entry<Object, Object> e: map.entrySet()){ ...
	public static void main(String[] args){
		try{
//-*-*- tp start -*-*-
			final int INF = Integer.MAX_VALUE, MINF = Integer.MIN_VALUE;
			SpecialComparator scomparator = new SpecialComparator();
			Scanner s = new Scanner(System.in);
//-*-*- tp end -*-*-
			//write a program...
			double x=0, y=0;
			while(s.hasNext()){
				double a = s.nextDouble(), b = s.nextDouble(), c = s.nextDouble(),
					d = s.nextDouble(), e = s.nextDouble(), f = s.nextDouble();
				y = (c*d-a*f)/(b*d-e*a);
				x = (c-(b*y))/a;
				System.out.printf("%.3f %.3f", x, y);
			}
//-*-*- tp start -*-*-
		}catch(Exception e){
			e.printStackTrace();
		}
	}
//-*-*- tp end -*-*-
	//functions
//-*-*- tp start -*-*-
	private static void debugl(Object obj){
		System.out.println(obj);
	}
	private static void debug(Object obj){
		System.out.print(obj);
	}
	private static String toStrmd(Object[] obj){
		return Arrays.deepToString(obj);
	}
}

class SpecialComparator implements Comparator{
	private int index = 0;
	public void setIndex(int index){
		this.index = index;
	}
	public int compare(Object a, Object b){
		String[] sa = (String[])a;
		String[] sb = (String[])b;
		return (sa[index].compareTo(sb[index]));
	}
}
//-*-*- tp end -*-*-