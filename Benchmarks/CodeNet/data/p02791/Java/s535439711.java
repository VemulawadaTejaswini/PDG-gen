import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] x=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
			for(int j=0;j<=i;j++) {
				if(x[j]<x[i])
					break;
				if(j==i)
					sum++;
			}
		}
		System.out.print(sum);
	}
} 