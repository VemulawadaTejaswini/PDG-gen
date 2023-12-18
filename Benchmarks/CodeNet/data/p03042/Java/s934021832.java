import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String a = scan.next();
		int b=0,c=0;
		String ans;
		if(Character.getNumericValue(a.charAt(0))!=0){
			b+=Character.getNumericValue(a.charAt(0))*10;
		}b+=Character.getNumericValue(a.charAt(1));
		if(Character.getNumericValue(a.charAt(2))!=0){
			c+=Character.getNumericValue(a.charAt(2))*10;
		}c+=Character.getNumericValue(a.charAt(3));
		if(b>=1&&b<=12&&c>=1&&c<=12){
			ans="AMBIGUOUS";
		}else if(b>=1&&b<=12){
			ans="MMYY";
		}else if(c>=1&&c<=12){
			ans="YYMM";
		}else{
			ans="NA";
		}
		System.out.println(ans);
	}
}