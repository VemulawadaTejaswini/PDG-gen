import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	int a,b,d,r;
	float f;
	Scanner scan = new Scanner(System.in);
	
	a= Integer.parseInt(scan.next());
	b= Integer.parseInt(scan.next());
	d=a/b;
	r=a%b;
	f=(float)a/b;

	
	System.out.println(d+" "+r+" "+f);
	}
	
}