import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		char[] s=sc.next().toCharArray();
		int[] k=new int[n+1];
		for(int i=1; i<n; i++){
			if(k[i]>0){
				continue;
			}
			for(int j=i+1; j<=n; j++){
				if(s[i-1]==s[j-1]){
					k[i]=k[i-1]+1;
					k[j]=k[j-1]+1;
				}
			}
		}
		Arrays.sort(k);
		int ans=k[n];
		if(k[n]!=k[n-1]){
			ans=k[n-1];
		}
		System.out.println(ans);
	}
}
