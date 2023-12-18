import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		if( a!=1 && b!=1 ){
			ans = 1;
		}
		if( a!=2 && b!=2 ){
			ans = 2;
		}
		if( a!=3 && b!=3 ){
			ans = 3;
		}
		System.out.println(ans);
	}
}
