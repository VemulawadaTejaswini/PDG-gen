import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		n = sc.nextInt();
		k = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int sum = 0;
		int count = 0;
		boolean flag = false;
		for(int i = 0; i < n; i++){
			sum += a[i];
			if(sum > k){
				flag = true;
				for(int j = 0; j < i; j++){
					sum -= a[j];
					if(sum >= k){
						count++;
					}
					else{
						break;
					}
				}
				break;
			}
		}
		if(!flag)
			System.out.println(n);
		else
			System.out.println(count);
		sc.close();
	}
}
