import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		String str = sc.next();
		String ret = "";
		while(!str.isEmpty()){
			ret += str.charAt((str.length()-1));
			str = str.substring(0,str.length()-1);
		}
		System.out.println(ret);
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
		
	}
}