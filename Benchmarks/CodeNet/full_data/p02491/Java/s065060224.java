import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int a,b,d,r;
		float f;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		d=a/b;
		r=a%b;
		f=(float)a/b;
		System.out.println(d +" "+ r +" "+ f);
	}
}