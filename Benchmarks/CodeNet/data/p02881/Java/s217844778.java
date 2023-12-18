import java.util.*;
public class Main { 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		for(int i = 1; i < n/2; i++) {
			if(n % i == 0) {
				a = (i-1) + (n / i - 1);
			}
		}
		System.out.println(a);
     }
}