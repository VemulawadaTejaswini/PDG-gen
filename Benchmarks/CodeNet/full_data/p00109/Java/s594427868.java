import java.util.Scanner;

public class Main {
	static int lastInd(String str,char a) {
		int n = 0;
		for(int i=str.length()-1;i>0;i--) {
			char c = str.charAt(i);
			if(c=='(')
				n++;
			if(c==')')
				n--;
			if(a==c && n==0)
				return i;
		}
		return -1;
	}
	
	static int parse(String str) {
		int a = 0;
		int sum = 0;
		int s = 0;
		int st = str.length()-1;
		int en = 0;
		int flag = 0;
		
		if(str.contains(")")) {
			flag = 1;			//(())を想定して+-で考える
			if(str.charAt(0)=='(' && str.charAt(str.length()-1)==')') {
				return parse(str.substring(1, str.length()-1));
			}
		}
		
		if(lastInd(str,'-')!=-1) {
			sum = parse(str.substring(0, lastInd(str,'-'))) - parse(str.substring(lastInd(str,'-')+1));
		}
			
		else if(lastInd(str,'+')!=-1) {
			sum = parse(str.substring(0, lastInd(str,'+'))) + parse(str.substring(lastInd(str,'+')+1));
		}
			
		else if(lastInd(str,'/')!=-1) {
			sum = parse(str.substring(0, lastInd(str,'/'))) / parse(str.substring(lastInd(str,'/')+1));
		}
			
		else if(lastInd(str,'*')!=-1){
			sum = parse(str.substring(0, lastInd(str,'*'))) * parse(str.substring(lastInd(str,'*')+1));
		}
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
