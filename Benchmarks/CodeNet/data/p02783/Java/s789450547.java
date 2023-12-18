import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int A = sc.nextInt();
		int b = 0;
		if( H%A!=0 ){
			b = 1;
		}
		System.out.println(H/A+b);
	}
}