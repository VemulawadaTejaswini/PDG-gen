import java.util.Scanner;

public class Main {
			static long x;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String array = sc.next();
		x=0;
		for(int i=0;i<array.length();i++) {
			f(i,0,array);
		}
	}
	
	static void f(int plus,long sum,String str) {
		if(plus!=0) {
			for(int i;i<str.length()-plus+1;i++) {
				f(plus-1,Long.parseLong(str.substring(0,i))+sum,str.substring(i,str.length()));
			}
		}else {
			x+=sum+Long.parseLong(str);
		}
	}
}
