import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int max = 0;
		for(int i =0 ; i < n ;i++){
			a[i] = sc.nextInt();
			max = Math.max(a[i], max);
		}
		
		int gcd = gcd(a);
//		System.out.println(gcd+" "+Arrays.toString(a));
		
		System.out.println(k<=max && k%gcd==0?"POSSIBLE":"IMPOSSIBLE");
	}
	
	int gcd(int[] arr){
		int min = arr[0];
		for(int i = 1 ; i < arr.length ; i++){
			if(arr[i]==0){
				continue;
			}
			min = Math.min(min, arr[i]);
			if(arr[0] > arr[i]){
				if(arr[0] % arr[i] != 0){
					for(int j =0 ;j < arr.length ;j++){
						if(j != i){
							arr[j] = arr[j]%arr[i];
						}
					}
					return gcd(arr);
				}
			}else{
				if(arr[i] % arr[0] != 0){
					for(int j =1 ;j < arr.length ;j++){
						if(j != 0){
							arr[j] = arr[j]%arr[0];
						}
					}
					return gcd(arr);
				}
			}
		}
		return min;
	}
}
