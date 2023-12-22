import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		while(true){
			int n=sc.nextInt();
			if(n==0) break;
			int sum=0,maxi=0,mini=1000;
			for(int i=0;i<n;i++){
				int a=sc.nextInt();
				sum+=a;
				maxi=Math.max(maxi,a);
				mini=Math.min(mini,a);
			}
			System.out.println((sum-maxi-mini)/(n-2));
		}

		return;
	}
}