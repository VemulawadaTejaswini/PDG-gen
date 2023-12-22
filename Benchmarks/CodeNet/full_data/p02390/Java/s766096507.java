import java.util.Scanner;

public class Mian{
	public static void main(String[] args){
	
		Scanner a = new Scanner(System.in);
		
		int S = a.nextInt();
		int h = a.nextInt(S/3600);
		int m = a.nextInt((S % 3600)/60);
		int s = a.nextInt(S- (h*3600+m*60));
		System.out.println(h + ":" + m + ":" + s);
	}
}