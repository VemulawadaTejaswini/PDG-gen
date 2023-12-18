import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int w,a,b,distance;
		Scanner sc = new Scanner(System.in);

		w = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();

		distance = b - (a+w);
		System.out.println(distance);
	}
}
