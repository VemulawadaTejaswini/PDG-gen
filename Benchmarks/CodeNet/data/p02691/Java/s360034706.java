import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		Set <Integer> set = new HashSet<>();
		for(int i = 0; i < n ; i++){
			a[i] = scan.nextInt();
		}
		for(int i = 0; i < n; i++){
			set.add(a[i]);
		}
		int count = 0;
		for(int i = 0; i < n-1; i++){
			for(int j = i+1; j < n; j++){
				if(Math.abs(i-j) == a[i]+a[j]){
					count++;
				}
			}
		}
		System.out.println(count);

	}
}