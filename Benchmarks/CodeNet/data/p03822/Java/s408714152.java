import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=1;
		int two=2;
		while(two<n){
			two*=2;
			count++;
		}
		int[] a=new int[n];
		a[0]--;
		int max=0;
		for(int i=0; i<n-1; i++){
			int tmp=sc.nextInt()-1;
			a[tmp]++;
			max=Math.max(max,a[tmp]);
		}
		System.out.println(Math.max(max+1,count));
	}
}
