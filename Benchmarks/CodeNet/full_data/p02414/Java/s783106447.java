import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		//入力導入部
		Scanner sc=new Scanner(new BufferedReader(System.in));
		
			int n=sc.nextInt();
			int m=sc.nextInt();
			int l=sc.nextInt();
			
			///////////////////////////////////////////////////////////////////
			//計算部			x=n+n-i+n-l
			int[][] a,b,c;
			a=new int[n][m];
			b=new int[m][l];
			c=new int[n][l];
		
			for(int s=0;s<n;s++){
				for(int t=0;t<m;t++){
					a[s][t]=sc.nextInt();
					}
							}

			for(int s=0;s<m;s++){
				for(int t=0;t<l;t++){
					b[s][t]=sc.nextInt();
					}
							}sc.close();
			//////配列Cを作成する
			int sum;
			for(int x=0;x<n;x++){
				for(int y=0;y<l;y++){sum=0;
					for(int i=0;i<m;i++){
						sum+=a[x][i]*b[i][y];
					}c[x][y]=sum;
				}
			}
							
							
			for(int i=0;i<n;i++){
				for(int s=0;s<l;s++){
					if(s==0)System.out.print(c[i][s]);
					else System.out.print(" "+c[i][s]);
				}System.out.println();
			}
		}

		
}