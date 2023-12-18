import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w=sc.nextLong(),h=sc.nextLong(),x=sc.nextLong(),y=sc.nextLong();
		double sum=w*h;
		if(w/h==x/y) {
			System.out.println(sum/2+" "+0);
		}else{
			System.out.println(Math.min(Math.min(w-x,x)*h, w*Math.min(y, h-y))+" "+0);
		}
	}
}

