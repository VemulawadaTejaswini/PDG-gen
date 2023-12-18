import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k= sc.nextInt();
		int r=Math.min(n,k);
		long ans=0;
		long[] v=new long[n];
		for(int i=0;i<n; i++){
			v[i]= sc.nextLong();
		}
		for(int i=0; i<=r; i++){
			int sum1=0;
			ArrayList<Long> list1=new ArrayList<>();
			for(int q=0; q<i; q++){
				sum1+=v[q];
				if(v[q]<0){
					list1.add(v[q]);
				}
			}
			for(int j=0; j<=r-i; j++){
				int sum2=0;
				ArrayList<Long> list2=new ArrayList<>();
				for(int o=n-1; o>n-1-j; o--){
					sum2+=v[o];
					if(v[o]<0){
						list2.add(v[o]);
					}
				}
				list1.addAll(list2);
				Collections.sort(list1);
				int count=k-j-i;
				if(count<0){
					break;
				}
				int sum=sum1+sum2;
				if(count==0){
					ans=Math.max(ans,sum);
					break;
				}
				for(int u=0; u<list1.size(); u++){
					count--;
					sum+=-list1.get(u);
					if(count==0){
						break;
					}
				}
				ans=Math.max(ans,sum);
			}
		}
		System.out.println(ans);
	}
}
