
import java.util.*;

public class Main {
	 
	static String str;
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		str=cin.next();
		StringBuffer sb=new StringBuffer(str);
		int n=cin.nextInt();
		
		for(int i=0;i<n;i++) {
			String odr=cin.next();
			
			if(odr.equals("print")) {
				int a=cin.nextInt(),b=cin.nextInt();
				String printstr=sb.substring(a, b+1);
				System.out.println(printstr);
			}
			else if(odr.equals("reverse")) {
				int a=cin.nextInt(),b=cin.nextInt();
				StringBuffer rsb=new StringBuffer(sb.substring(a, b+1));
				rsb.reverse();
				sb.replace(a, b+1, rsb.toString());
			}
			else if(odr.equals("replace")) {
				int a=cin.nextInt(),b=cin.nextInt();
				String rs=cin.next();
				sb.replace(a, b+1, rs);
			}
		}
	}
	
	
	
}
