import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] A=new int[n];
		for(int i=0;i<n;i++){
			A[i]=sc.nextInt();
		}
		
		int l=0,r=0;
		long x=A[0];
		int comb=1;
		while(r<n-1){
//			System.out.println(l+","+r+","+x);
			if((x&A[r+1])==0){
				x=x|A[r+1];
				r++;
				comb+=r-l+1;
			}else{
				x=x^A[l];
				l++;
			}
		}
		System.out.println(comb);
		
	}
	
	public static int[][] readhw(int height, int width){
		int[][] hw = new int[height][width];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<height;i++)
			for(int j=0;j<width;j++)
				hw[i][j]=sc.nextInt();
		return hw;
	}
}
