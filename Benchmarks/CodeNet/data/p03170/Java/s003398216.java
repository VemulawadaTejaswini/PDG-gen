import java.util.*;
public class Main {
	static boolean dp[]=new boolean[100005];
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<k+1;i++){
			for(int j=0;j<n;j++){
				if(i>=arr[j]){
					if(dp[i-arr[j]]==false){
						dp[i]=true;
					}
				}
			}
		}
		if(dp[k]==true){
			System.out.println("First");
		}
		else{
			System.out.println("Second");
		}
	}
}
