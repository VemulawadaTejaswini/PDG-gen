import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int l = t.length();
		int min = l;
		if(s.equals(t))System.out.println(0);
		else {
			for(int i = 0; i < s.length()-l; i++) {
				int count = 0;
				for(int j = 0; j < l; j++) {
					if(s.charAt(i+j)!=t.charAt(j))count++;
				}
				if(count<min)min=count;
			}
			System.out.println(min);
		}
	}
}