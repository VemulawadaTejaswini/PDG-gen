package training;
import java.util.Scanner;

public class Training01 {
	public static void main(String[]orgs){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

		int a = 1;
		int b = 1;
		int count = 0;
		while(a<=b){
			//System.out.println(a+","+b);
			a++;
			b= n-a;
			count++;
		}
		System.out.println(count);
	}
}
