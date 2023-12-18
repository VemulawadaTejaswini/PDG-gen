import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a = {0,0,0,0,0};
		int[] b = {0,0,0,0,0};
		int c = 10;
		int d = 0;
		int sum = 0;
		while(a[0] < 1 || a[1] < 1 || a[2] < 1 || a[3] < 1 ||a[4] < 1 || a[0] > 123 || a[1] > 123 || a[2] > 123 || a[3] > 123 || a[4] > 123){
			for(int i = 0; i < 5; i++){
				a[i] = sc.nextInt();
			}
		}
		for(int i = 0; i < a.length; i++){
			b[i] = a[i] % 10;
		}
		for(int i = 0; i < b.length; i++){
			if(c >= b[i] && b[i] != 0){
				c = a[i];
				a[i] = 0;
				d = 10 - b[i];
				b[i] = 0;
			}
		}
		for(int i = 0; i < b.length; i++){
			sum = sum + a[i] + (10 - b[i]);
		}
		sum = sum + c + d;
		System.out.println(sum);
	}
}