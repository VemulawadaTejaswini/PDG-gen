import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum=0;
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		int count=0;
		if(sum%(4*m)==0){
			sum=sum/(4*m)-1;
		}else{
			sum=sum/(4*m);
		}
		for(int i=0; i<n; i++){
			if(sum<a[i]){
				count++;
			}
		}
		if(count<m){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}
