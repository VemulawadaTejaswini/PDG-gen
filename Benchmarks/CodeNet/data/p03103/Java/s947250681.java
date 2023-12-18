import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int []a = new int [n];
		
		for(int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
			int b = sc.nextInt();
			hm.put(a[i],b);
			}
		Arrays.sort(a);
		long num = 0;
		long sum = 0;
		
		for(int i = 0; i < n ; i++) {
			num += hm.get(a[i]);
			if(num < m) {
				sum += (long)a[i] * hm.get(a[i]);
			}
			if(num >= m) {
				sum += (long)a[i] * (m - num + hm.get(a[i]));
				break;
			}
				
			}
		System.out.println(sum);
		}
	}