import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		int a[][]=new int[16][10];
		int i,j;
		
		//初期化
		for(i=0;i<16;i++){
			for(j=0;j<10;j++){
				if(i%4==0)a[i][j]=-1;
				else a[i][j]=0;
			}
		}
		
		int n=scan.nextInt();
		for(i=0;i<n;i++){
			int b=scan.nextInt();
			int f=scan.nextInt();
			int r=scan.nextInt();
			int v=scan.nextInt();
			
			a[4*(b-1)+f][r-1]+=v;
		}
		
		for(i=1;i<16;i++){
			for(j=0;j<10;j++){
				if(a[i][j]==-1)System.out.print("##");
				else System.out.printf(" %d",a[i][j]);
			}
			System.out.println();
		}
	}
}
