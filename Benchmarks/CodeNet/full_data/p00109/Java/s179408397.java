
import java.util.Scanner;

public class Main {
	static int lastInd(int st,String str,String f) {
		char a = f.charAt(0);
		for(int i=st;i>=0;i--) {
			if(str.charAt(i)==a)
				return i;
		}
		return -1;
	}
	static int parse(String str) {
		int a = 0;
		int b = 0;
		int sum = 0;
		int s = 0;
		int st = str.length()-1;
		int en = 0;
		
		
		System.out.println(str);
		if(str.contains(")")) {	
			if(str.charAt(0)=='(' && str.charAt(str.length()-1)==')') {
				return parse(str.substring(1, str.length()-1));
			}
			for(int i=str.length()-1;i>=0;i--) {
				if(str.charAt(i)==')') {
					s++;
					en = Math.max(en, i);
				}
				else if(str.charAt(i)=='(') {
					s--;
					st = Math.min(st, i);
				}
				if(s==0) {
					st++;
					break;
				}
			}
		}
		
		if(str.contains("-") && lastInd(st,str,"-")!=-1) {
			a = lastInd(st,str,"-");
			sum = parse(str.substring(0, a)) - parse(str.substring(a+1));
		}
			
		else if(str.contains("+") && lastInd(st,str,"+")!=-1) {
			a = lastInd(st,str,"+");
			sum = parse(str.substring(0, a)) + parse(str.substring(a+1));
		}
			
		else if(str.contains("/") && lastInd(st,str,"/")!=-1) {
			a = lastInd(st,str,"/");
			sum = parse(str.substring(0, a)) / parse(str.substring(a+1));
		}
			
		else if(str.contains("*") && lastInd(st,str,"*")!=-1){
			a = lastInd(st,str,"*");
			sum = parse(str.substring(0, a)) * parse(str.substring(a+1));			}
		else
			return Integer.parseInt(str);
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		while(a--!=0) {
			String str = sc.next();
			System.out.println(parse(str.substring(0,str.length()-1)));
		}
	}
}
