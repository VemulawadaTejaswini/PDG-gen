import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		boolean[] su=new boolean[n];
		for(int i=0; i<k; i++){
			int d=sc.nextInt();
			for(int j=0; j<d; j++){
				int a=sc.nextInt()-1;
				su[a]=true;
			}
		}
		int ans=0;
		for(int i=0; i<n; i++){
			if(!su[i]){
				ans++;
			}
		}
		System.out.println(ans);
	}
}