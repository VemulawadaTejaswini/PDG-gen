import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int w=in.nextInt(),h=in.nextInt(),c=in.nextInt();
		int g;
		if(w<h)g=gcd(h,w);
		else g=gcd(w,h);
		System.out.println((w/g)*(h/g)*c);
	}
	
	static int gcd(int a,int b) {
		int g=a%b;
		if(g==0)return b;
		else return gcd(b,g);
	}

}

