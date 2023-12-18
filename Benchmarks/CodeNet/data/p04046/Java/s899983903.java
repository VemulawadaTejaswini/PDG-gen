import java.util.*;

public class Main{
static int mod=(int) (1e9+7);
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
 h=sc.nextInt();
 v=sc.nextInt();
 fa=sc.nextInt();
 fb=sc.nextInt();
long maze[][]=new long[h][v];
for(int i=h-1;i>=h-fa;i--) {
	for(int j=0;j<fb;j++) {
		maze[i][j]=1;
	}
}
rec(maze,0,0,h,v);
System.out.println(count);

		
	}
	static int h,v,fa,fb,count=0;
	
	static void readArray(int[] arr,Scanner sc) { 
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	static void rec(long[][] vs,int i,int j,int f1,int f2) {
		if(i<h&&j<v&&i==f1-1&&j==f2-1) {
count=(count+1)%mod;
return;
}
		if(i<h&&j<v&&vs[i][j]!=1) {
			rec(vs,i+1,j,f1,f2);
			rec(vs,i,j+1,f1,f2);
		}else {
			return;
		}
		
		
	}
	
	

}
