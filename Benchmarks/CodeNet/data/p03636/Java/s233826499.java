import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String top = s.substring(0,1);
		String finish =  s.substring(s.length()-2,s.length()-1);
		//System.out.println(top);
		//System.out.println(finish);
		
		

		System.out.println(top + ""+ s.length()-2 + "" + finish );
		
		
		
		
	
	}
}
