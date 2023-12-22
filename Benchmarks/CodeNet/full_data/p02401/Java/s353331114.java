import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			String op =  sc.next();
			int b = sc.nextInt();
			if(a==0&&b==0&&op=="?"){
				break;
			}else{
				int p= calc(a,b,op);
				System.out.println(p);
			}
		}
	}
	public static int calc(int x,int y,String m){
		int q=0;
		switch(m){
			case "+":	
				q=x+y;
				break;
			case "-":
				q=x-y;
				break;
			case "*":
				q=x*y;
				break;
			case "/":
				q=x/y;
				break;
		}
		return q;
	}
}