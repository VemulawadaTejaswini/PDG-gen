import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,ans=0;
		char op;
		while(true){
			a=sc.nextInt();
			op=sc.next().charAt(0);
			b=sc.nextInt();
			if(op=='?')break;
			if(op=='+')ans=a+b;
			if(op=='-')ans=a-b;
			if(op=='*')ans=a*b;
			if(op=='/')ans=a/b;
			System.out.println(ans);
		}
	}
}