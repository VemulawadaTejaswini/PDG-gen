import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public class Main{
	public static void main(final String[] args){
		Scanner sc = new Scanner(System.in);
        int sum = 0;
		int x = sc.nextInt();
		int a = 1;
		int b = 1;
		int result = 0;

		for(int i=1; i<=x; i++){
			if(x % i == 0){
			sum++;
			System.out.println(i);
			}
		}
		for(int i = 0; ; i++){
		   result = (a-b)*(a^4+a^3*b+a^2*b^2+a*b^3+b^4);
		   Math.abs(result);
		   if(result == x){
			   break;
		   }
		   a++;
		   b++;

		}
		if(result != x){
		  a *= -1;
		  b *= -1;
		}
		System.println(a + '' + b);

	}
}
