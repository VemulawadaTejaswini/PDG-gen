import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w=sc.nextLong(),h=sc.nextLong(),x=sc.nextLong(),y=sc.nextLong();
		double sum=w*h;
		if(w/2.0==x && h/2.0==y) {
			System.out.println(sum/2+" "+1);
		}else{
			System.out.println(Math.min(Math.max(w-x,x)*h, w*Math.min(y, h-y))+" "+0);
		}
	}
}

