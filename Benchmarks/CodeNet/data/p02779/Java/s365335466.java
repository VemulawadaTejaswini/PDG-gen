import java.util.*;

public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int c=0;
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					c++;
					break;
				}
			}
		if(c>0)
			System.out.println("NO");
		else 
			System.out.println("YES");
	}
}