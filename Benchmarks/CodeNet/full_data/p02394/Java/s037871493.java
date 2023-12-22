import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int w,h,x,y,r;
		w=sc.nextInt();
		h=sc.nextInt();
		x=sc.nextInt();
		y=sc.nextInt();
		r=sc.nextInt();
		
		if((x+r)<=w && (x-r)>=0 && (y+r)<=h && (y-r)>=0) System.out.println("Yes");
		else System.out.println("No");
		
	}

}