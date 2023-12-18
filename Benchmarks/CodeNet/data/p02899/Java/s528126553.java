import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int[] x=new int[n];
		int[] y=new int[n+1];
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
			y[x[i]] = i+1;
		}
		for(int i=1;i<=n;i++)
			System.out.print(y[i]+" ");
	}
}
