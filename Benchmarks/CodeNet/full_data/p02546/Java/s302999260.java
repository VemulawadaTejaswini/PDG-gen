import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = s;
		if(s.charAt(s.length()-1)!='s') ans+="s";
		else ans+="es";
		System.out.println(ans);
	}
}