
import java.util.Scanner;
public class Main {
	static int a,b,c,d,n;
	static int x() {
		int h = n/a;
		if(n%a!=0)h++;
		return h*b;
	}
	static int y() {
		int h = n/c;
		if(n%c!=0)h++;
		return h*d;
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 while(sc.hasNext()) {
			 n = sc.nextInt();
			 a = sc.nextInt();
			 b = sc.nextInt();
			 c = sc.nextInt();
			 d = sc.nextInt();
			 
			 if(x()<y())
				 System.out.println(x());
			 else
				 System.out.println(y());
	  }	 
	}
}
