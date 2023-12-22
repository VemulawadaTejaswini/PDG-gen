import java.util.*;

public class Main{
//public class abc167_a{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String t = scan.next();	

		String ts = s + t.charAt(t.length() - 1);

		boolean flag = true;
		
		
		for(int i=0; i<t.length(); i++){
			if( Character.isUpperCase( t.charAt( i ) ) ) flag = false;
		}

		if( !(s.length()>0 && s.length() < 11) ) flag = false;

		if( !t.equals(ts) ) flag = false;


		if(flag){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}