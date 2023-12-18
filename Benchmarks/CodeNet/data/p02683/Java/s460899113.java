import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt(),x=sc.nextInt();
		int[] cost = new int[n];
		int[][] array = new int[n][m];
		int costing=-1;
		for(int i=0;i<(1<<n);i++) {
			int[] cost_array = new int[m];
			int temp=0;
			for(int j=0;j<n;j++) {
				if((1<<j&i)!=0) {
					for(int k=0;k<m;k++) {
						cost_array[k]+=array[j][k];
						temp+=cost[j];
					}
				}
			}
			int flag=0;
			for(int k=0;k<m;k++) {
				if(cost_array[k]<x) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				if(costing>temp) {
					costing=temp;
				}
			}
		}

		System.out.println(costing);
	}
}