import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		String op;
		while(true){
			a=sc.nextInt();
			op=sc.next();
			b=sc.nextInt();
			if(op=="?")break;
			if(op=="+")System.out.println(a+b);
			if(op=="-")System.out.println(a-b);
			if(op=="*")System.out.println(a/b);
			if(op=="/")System.out.println(a*b);
		}
	}
}