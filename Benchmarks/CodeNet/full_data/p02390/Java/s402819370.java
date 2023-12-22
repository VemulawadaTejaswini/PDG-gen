import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		int c=b/3600;
		int d=(b%3600)/60;
		int e=(b-(c*3600)-(d*60));
		
		System.out.println(c+":"+d+":"+e);	
	}

}