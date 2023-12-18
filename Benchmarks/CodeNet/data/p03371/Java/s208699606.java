import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		long a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
		if(c*2<a&&c*2<b) {
			System.out.println((long)c*2*Math.max(x, y));
		}else if(c*2<=a+b) {
			if(x>=y) {
				System.out.println((long)(c*2*Math.min(x,y)+(x-y)*a));
			}else {
				System.out.println((long)(c*2*Math.min(x,y)+(y-x)*b));
			}
		}else {
			System.out.println(x*a+y*b);
		}
	}
}

