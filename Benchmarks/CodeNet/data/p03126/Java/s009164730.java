import java.util.*;

public class Main{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt(); //n人の人に聞いた
		int m=sc.nextInt(); //m種類の食べ物
		int ans[]=new int[m+1];
		for(int i=0;i<m+1;i++){
			ans[i]=0;
		}
		int k;
		int t;
		for(int i=0;i<n;i++){
			k=sc.nextInt();
			for(int s=0;s<k;s++){
				t=sc.nextInt();
				ans[t]++;
			}
		}
		int count=0;
		for(int i=0;i<m+1;i++){
			if(ans[i]==n){
				count++;
			}
		}

		System.out.println(count);
	}
}
