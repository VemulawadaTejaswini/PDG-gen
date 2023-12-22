import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,d,r;
		double f,da,db;
		a=sc.nextInt();
		b=sc.nextInt();
		d=a/b;
		r=a%b;
		da=a;
		db=b;
		f=da/db;
		System.out.println(d+" "+ r +" "+f);
	}
}