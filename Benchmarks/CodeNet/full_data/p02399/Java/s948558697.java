import java.util.Scanner;
class Main{
    public static void main(String[] args){
		int a,b,d,r;
		double f;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		d=a/b;
		r=a-b*d;
		f=(double)a/b;
		System.out.println(d+" "+r+" "+String.format("%.5f",f));
    }
}
