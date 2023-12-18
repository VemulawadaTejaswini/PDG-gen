import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		if(S.length()<5)System.out.println("NO");
		StringBuilder s=new StringBuilder(S); 
		ArrayList<String>de=new ArrayList<>();
		de.add("dream");
		de.add("dreamer");
		de.add("erase");
		de.add("eraser");
		while(true){
			if(de.contains(s.substring(0,s.length()))){System.out.println("YES");break;}
			if(s.length()<5 || s.length()==6 || s.length()==8 || s.length()==9){System.out.println("NO");break;}
			if(s.substring(0,6).equals("dreamd")||s.substring(0,6).equals("dreame"))s.delete(0,5);
			else if(s.length()>=6&&(s.substring(0,6).equals("erasee")||s.substring(0,6).equals("erased")))s.delete(0,5);
			else if(s.length()>=7&&(s.substring(0,7).equals("erasere")||s.substring(0,7).equals("eraserd")))s.delete(0,6);
			else if(s.length()>=8&&(s.substring(0,8).equals("dreamerd")||s.substring(0,8).equals("dreamere")))s.delete(0,7);
			else {System.out.println("NO");break;}
			
		}
		
		
}