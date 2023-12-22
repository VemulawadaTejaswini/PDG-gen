import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b,l,s;
		a=sc.nextInt();
		b=sc.nextInt();
		l=a*2+b*2;
		s=a*b;
		System.out.println(s);
		System.out.println(l);
		sc.close();
	}
}

