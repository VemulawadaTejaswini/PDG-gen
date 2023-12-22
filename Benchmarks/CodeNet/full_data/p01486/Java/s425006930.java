import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc;
	public void run(){
		sc = new Scanner(System.in);
		s = sc.next();
		calc();
	}
	String s;
	public void calc(){
		boolean ans;
		ans = boolMEW();
		
		if(ans && s.equals("")) System.out.println("Cat");
		else System.out.println("Rabbit");
	}
	
	public boolean boolMEW(){
		if(s.equals("")) 
			return true;
		else{
			if(!s.substring(0, 1).equals("m")){
				return false;
			}
			s = s.substring(1);
			
			boolean a;
			if(s.substring(0,1).equals("m")){
				a = boolMEW();
				if(a && s.substring(0,1).equals("e")){
					s = s.substring(1);
				}
				else a = false;
			}
			else if(s.substring(0,1).equals("e")){
				a = true;
				s = s.substring(1);
			}
			else a = false;
			if(!a) return false;
			
			boolean b;
			if(s.substring(0,1).equals("m")){
				b = boolMEW();
				if(b && s.substring(0,1).equals("w")){
					s = s.substring(1);
				}
				else b = false;
			}
			else if(s.substring(0,1).equals("w")){
				b = true;
				s = s.substring(1);
			}
			else b = false;
			
			if(b) return true;
			else return false;
		}
	}
	public static void main(String[] args){
		new Main().run();
	}
}