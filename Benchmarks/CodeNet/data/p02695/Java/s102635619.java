
import java.util.*;
public class Main2 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();//Aの長さ
		int m=sc.nextInt();//Aの最大値
		int q=sc.nextInt();//abcdの長さ
		
		int[]a=new int[q];
		int[]b=new int[q];
		int[]c=new int[q];
		int[]d=new int[q];
		
		for(int i=0;i<q;i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			c[i]=sc.nextInt();
			d[i]=sc.nextInt();
		}
		
		int[]k=new int[n];
		
		if(q==1)System.out.println(d[0]);
		else System.out.println(dfs(k, 0, a,b,c,d,0,m));
		
	}
	
	static int dfs(int[] k, int index, int[] a,int[] b,int[]c, int[]d, int max, int m){
		if(index==k.length){
			int tmp=0;
			for(int i=0;i<a.length;i++){
				if(k[b[i]-1]-k[a[i]-1]==c[i])tmp+=d[i];
			}
			
			if(tmp>max)max=tmp;
			
			//for(int i=0;i<k.length;i++)System.out.print(k[i]);
			//System.out.println(max);
			return max;
		}
		
		for(int i=index;i<k.length;i++){
			for(int j=1;j<=m;j++){
				//System.out.print(index);
				k[index]=j;
				max=Math.max(dfs(k, index+1, a,b,c,d,max, m),max);
				
			}
		}
		return max;
		
		
	}
	
}
