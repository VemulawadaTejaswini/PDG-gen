import java.util.Scanner;
public class main{
	public static void main(String[] args){
		int w,a,b,distance;
		Scanner scw = new Scanner(System.in);
		Scanner sca = new Scanner(System.in);
		Scanner scb = new Scanner(System.in);

		w = scw.nextInt();
		a = sca.nextInt();
		b = scb.nextInt();

		distance = b - (a+w);
		System.out.println(distance);
	}
}
