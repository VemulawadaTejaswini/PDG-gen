import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static int LastIndexOf(String e,char c,char c2) {
		for(int i=e.length()-1; i>0; i--) {
			int nest = 0;
			if(e.charAt(i) == ')') {
				nest++;
			}if(e.charAt(i) == '(') {
				nest--;
			}
			if((c == e.charAt(i) || c2 == e.charAt(i)) && nest == 0) {
				return i;
			}
		}
		return -1;
	}
	
	static int calc(String e) {
		int pos = LastIndexOf(e,'+','-');
		if(pos != -1) {
			if(e.charAt(pos) == '+') {
				return calc(e.substring(0,pos))+calc(e.substring(pos+1));
			}else if(e.charAt(pos) == '-'){
				return calc(e.substring(0,pos))-calc(e.substring(pos+1));
			}
		}
		
		pos = LastIndexOf(e,'*','/');
		if(pos != -1) {
			if(e.charAt(pos) == '*') {
				return calc(e.substring(0,pos))*calc(e.substring(pos+1));
			}else if(e.charAt(pos) == '/'){
				return calc(e.substring(0,pos))/calc(e.substring(pos+1));
			}
		}

		if(e.startsWith("(")){
				return calc(e.substring(1,e.length()-1));
		}else{
			return Integer.parseInt(e);	
		}
	}
	
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println(calc("1+(2+3)"));
			
			
		}
	}
}
		

