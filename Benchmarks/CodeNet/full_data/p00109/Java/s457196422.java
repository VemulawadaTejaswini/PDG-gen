import java.util.Scanner;

public class Main {
	static int mark;
	static boolean cont(int st,int en,String str,String f,int flag) {
		char g = f.charAt(0);
		if(flag==1) {
			for(int i=str.length()-1;i>=0;i--) {
				if(st <= i && i <= en)continue;		//()内を無視
				if(str.charAt(i)==g) {
					mark = i;
					return true;
				}
			}
			return false;
		}
		else {
			if(str.contains(f)) {
				mark = str.lastIndexOf(f);
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	static int parse(String str) {
		System.out.println(str);
		int a = 0;
		int sum = 0;
		int s = 0;
		int st = str.length()-1;
		int en = 0;
		int flag = 0;
		mark = 0;
		
		
		if(str.contains(")")) {
			flag = 1;						//(())を想定して+-で考える
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
		
		if(cont(st,en,str,"-",flag)) {
			a = mark;
			sum = parse(str.substring(0, a)) - parse(str.substring(a+1));
		}
			
		else if(cont(st,en,str,"+",flag)) {
			a = mark;
			sum = parse(str.substring(0, a)) + parse(str.substring(a+1));
		}
			
		else if(cont(st,en,str,"/",flag)) {
			a = mark;
			sum = parse(str.substring(0, a)) / parse(str.substring(a+1));
		}
			
		else if(cont(st,en,str,"*",flag)){
			a = mark;
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
