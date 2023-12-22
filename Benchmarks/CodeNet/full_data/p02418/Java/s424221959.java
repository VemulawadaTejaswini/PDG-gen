
import java.util.*;
import java.util.regex.Pattern;

public class Main {
	 
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		String str=cin.nextLine();
		str=str+str;
		String jstr=cin.nextLine();
		
		if(str.indexOf(jstr)!=-1)System.out.println("Yes");
		else System.out.println("No");
	}
	
}
