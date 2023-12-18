import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int min=100000;
		if(min>a+b)min=a+b;
		if(min>a+c)min=a+c;
		if(min>c+b)min=c+b;
		System.out.println(min);
	}
}