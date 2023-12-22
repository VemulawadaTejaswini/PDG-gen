import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 int d;
	 int r;
	 double f;
	 d=a/b;
	 r=a%b;
	 f=a*1.0/b;
	 System.out.println(d+" "+r+" "+String.format("%f",f));
	  sc.close();
  }
}
