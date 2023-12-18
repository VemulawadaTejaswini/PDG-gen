import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		long h=sc.nextLong(),w=sc.nextLong();
		if(h%2==0) {
			System.out.println((long)((Math.ceil(h/2.0)*w)));
		}else {
			System.out.println((long)(Math.ceil(h/2.0)*Math.ceil(w/2.0)+(h/2)*(w/2)));
		}
		/*System.out.println(Math.ceil(h/2.0)+" "+h/2);
		System.out.println(Math.ceil(w/2.0)+" "+w/2);//Math.ceil(h/2.0)*Math.ceil(w/2.0)
		System.out.println(Math.ceil(h/2.0)*Math.ceil(w/2.0)+" "+(h/2)*(w/2));*/
	}
}
