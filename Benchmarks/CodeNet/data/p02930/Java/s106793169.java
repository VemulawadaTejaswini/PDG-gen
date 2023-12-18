import java.util.*;
import java.math.*;
import java.io.*;

class Main
{
	
	public static void main(String[] args)
	
	{
		new Main().run();
	}
	
	void run(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int sz=0;
		while((1L<<sz)<=N)++sz;
		int[][] a=new int[N][N];
		for(int i=0;i<N;++i)for(int j=0;j<N;++j)a[i][j]=-1;
		for(int shift=0;shift<sz;++shift){
			for(int i=0;i<N;++i){
				for(int j=0;j<N;++j){
					if((((i>>shift)%2)^((j>>shift))%2)==0)continue;
					if(a[i][j]!=-1)continue;
					a[i][j]=shift+1;
					a[j][i]=shift+1;
				}
			}
		}
		for(int i=0;i<N;++i){
			for(int j=i+1;j<N;++j){
				System.out.print(a[i][j]+(j==N-1?"\n":" "));
			}
		}
		
	}
	
	
	void tr(Object...objects){
		System.out.println(Arrays.deepToString(objects));
	}
}
