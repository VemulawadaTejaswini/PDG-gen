import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int s = scan.nextInt();
	int h =s/360;
	int m =(s-h*360)/60;
	s = s - h*360 -m*60;
	System.out.println(h+":"+m+":"+s);
	
	}

}