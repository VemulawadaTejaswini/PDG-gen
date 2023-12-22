import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		//System.out.print(area(x,y)+" ");
		//System.out.print(length(x,y));
		System.out.println(area(x,y) + " " + length(x,y));
		
	}
	public static int area(int a,int b) {
		return a * b;
	}
	public static int length(int a,int b) {
		return ((a*2)+(b*2)) ;
	}
}
