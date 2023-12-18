import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String top = s.substring(0,1);
		String finish =  s.substring(s.length()-1,s.length());
		//System.out.println(top);
		//System.out.println(finish);
		
		int a = s.length()-2;


		System.out.println(top + "" + a + "" + finish );
		
		
		
		
	
	}
}
