import java.util.Scanner;



public class Main {
	public static void main(String[]args){
		
		//????????£????????????
		Scanner sc = new Scanner(System.in);
		
		//int h = 46979; //?????? 
		int h = sc.nextInt();
		
		h = h / 3600; 
		//int m = 46979; //???
		int m = sc.nextInt();
		
		m = m % 360 / 60;
		//int s = 46979; //?§?
		int s = sc.nextInt();
		s = s % 60;
		System.out.println(h + ":" + m + ":" +s);
	}
}