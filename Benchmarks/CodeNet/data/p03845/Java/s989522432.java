import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] t=new int[n];
		for(int i=1;i<n;i++){
			t[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int[] p=new int[m],x=new int[m];
		for(int i=1;i<m;i++){
			p[i]=sc.nextInt();
			x[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;i++){
				sum+=t[j];
			}
			sum=sum-t[p[i]]+x[i];
			System.out.println(sum);
		}
	}
}