import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		int[][] a = new int[m][2];
		int[][] b = new int[q][2];
		for(int i = 0; i<m; i++){
			a[i][0]=sc.nextInt();
			a[i][1]=sc.nextInt();
		}
		for(int i = 0; i<q; i++){
			int z=sc.nextInt();
			int o = sc.nextInt();
			int count=0;
			for(int j = 0; j<m; j++){
				if(z<=a[i][0] && o>=a[i][1]){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}