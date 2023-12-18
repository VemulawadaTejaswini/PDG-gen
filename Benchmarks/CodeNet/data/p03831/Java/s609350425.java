import java.util.Scanner;


public class Main {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long walk = sc.nextInt();
		long teleport = sc.nextInt();
		int arr[] = new int[n+1];
		for(int i=1 ; i<=n ; i++){
			arr[i] = sc.nextInt();	
		}
		long ans = 0;
		for(int i=1 ; i<n ; i++){
			if((arr[i+1]-arr[i])*walk<teleport){
				ans += (arr[i+1]-arr[i])*walk;
			}else{
				ans += teleport;
			}
		}
		System.out.println(ans);
	}
}