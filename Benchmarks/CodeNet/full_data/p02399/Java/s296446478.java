import java.util.Scanner;

class Main{
  public static void main(String[] arg){
  	long a, b, d, r;
  	double f;
  	Scanner in = new Scanner(System.in);
  	a = in.nextInt();
  	b = in.nextInt();
  	d = a/b;
  	r = a%b;
  	f = (double)a/b;
  	System.out.println(d + " " + r + " " +f);
	}
}