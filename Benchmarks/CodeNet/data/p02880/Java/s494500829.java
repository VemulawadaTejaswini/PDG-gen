import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double a = (double)n;
		String s = "No";
		for(double i=1; i<10; i++){
			double b = a/i;
			if(b < 10 && b == (int)b){
				s = "Yes";
				break;
			}
		}
		System.out.println(s);   

	}
}