import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int k=sc.nextInt();
		char[][] fig=new char[h][w];
		for(int i=0; i<h; i++){
			fig[i]=sc.next().toCharArray();
		}
		int ansm=1010;
		label:
		for(int i=0; i<1<<(h-1); i++){
			int[][] a=new int[h][w];
			int jh=0;
			int ans=Integer.bitCount(i);
			for(int t=0; t<h; t++){
				for(int j=0; j<w; j++){
					a[jh][j]+=fig[t][j]-'0';
				}
				if((i>>t & 1)==1){
						jh++;
				}
			}
			int[] sum=new int[h];
			int front=0;
			for(int j=0; j<w; j++){
				for(int t=0; t<h; t++){
					sum[t]+=a[t][j];
					if(sum[t]>k){
						if(j==front){
							continue label;
						}
						front=j;
						Arrays.fill(sum,0);
						ans++;
						j--;
						break;
					}
				}
			}
			ansm=Math.min(ansm,ans);
		}
		System.out.println(ansm);
	}
}
