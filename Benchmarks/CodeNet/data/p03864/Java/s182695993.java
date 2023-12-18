import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		
		int a[]=new int [n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n-1;i++){
			while((a[i]+a[i+1])>x){
				sum++;
				if(a[i+1]>0){
					a[i+1]--;
				}else{
					a[i]--;
				}
				
			}
		}
		//System.out.println(Arrays.toString(a));
		System.out.println(sum);
		
	}
}
