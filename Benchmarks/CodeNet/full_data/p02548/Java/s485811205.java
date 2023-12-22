import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long count = 0;
		int c;
		for(int a = 1; a < n; a++){
			for(int b = 1; b < n; b++){
				c = n - a*b;
				if((a*b)+c==n && c > 0) count++;
			}
		}
		System.out.println(count);
	}
}