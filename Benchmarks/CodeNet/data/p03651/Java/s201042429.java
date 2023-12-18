import java.util.Scanner;

public class Main{

	static int gcd(int a, int b){
		if(a==0){
			return b;
		}
		else return gcd(b%a,a);
	}
	static String solve(int[] arr, int k){
		int g = arr[0];int max = arr[0];
		for(int i=1;i<arr.length;i++){
			g = gcd(g,arr[i]);
			if(arr[i]>max){
				max = arr[i];
			}
		}
		if(k%g==0&&k<=max){
			return "POSSIBLE";
		}
		return "IMPOSSIBLE";
		
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]= scan.nextInt();
			}
		System.out.println(solve(arr,k));
		}
	}




