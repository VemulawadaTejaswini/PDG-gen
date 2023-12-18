import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int x = scan.nextInt();
		int[] a = new int[n];
		int min = 1000000000;
		int minf = 0;
		
		for(int i = 0 ; i < n ; i++){
			
			a[i] = scan.nextInt();
			if(min > a[i]){
				min = a[i];
				minf = i;
			}
			
		}
		
		long sum = 0;
		int max = 0;
		int cnt = 1;
		
		for(int i = 1 ; i < n ; i++){
			//最少の値からスタート
			//System.out.println((minf + i) % n);
			if((a[(minf + i) % n] >= x)){
				cnt++;
			} else {
				sum += a[minf] * cnt;
				minf = (minf + i) % n;
				if(max < cnt){
					max = cnt - 1;
				}
				cnt = 1;
			}
			if((i == (n - 1))){
				sum +=a[minf] * cnt;
				if(max < cnt){
					max = cnt - 1;
				}
			}
		}
		
		sum += max * x;
		System.out.println(sum);
	}
}
