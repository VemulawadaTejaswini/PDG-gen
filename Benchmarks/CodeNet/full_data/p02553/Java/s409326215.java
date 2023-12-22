import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		int p=Math.abs(a);
		int q=Math.abs(b);
		int r=Math.abs(c);
		int s=Math.abs(d);
		int x=0;
		
		if(b<=0 && c<=0) {
			x=a*c;
		}
		else if(a>=0&&d>=0){
			x=b*d;
		}
		else if(b<=0&&c>=0) {
			x=b*c;
		}
		else if(a>=0&&d<=0){
			x=a*d;
		}
		else if(a<=0&&b>=0&&c<=0&&d>=0) {
			if(p*r>=q*s) {
				x=p*r;
			}
			else {
				x=q*s;
			}
		}
		System.out.println(x);
	}
}