import java.util.*;
import java.math.*;
public class Main {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			BigDecimal a=in.nextBigDecimal();
			BigDecimal b=in.nextBigDecimal();
			String ans=a.multiply(b).toString();
			for(int i=0;i<ans.length();i++) {
				if(ans.charAt(i)=='.')break;
				System.out.print(ans.charAt(i));
			}System.out.println();
				
		}
		
		
		in.close();//the end of main
	}
	
	
}