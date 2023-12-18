import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
	//	int b = sc.nextInt();
	//	int c = sc.nextInt();
		// 文字列の入力
	//	String s = sc.next();
		// 出力
    int[] d=new int[a];
    for(int i=0;i<a;i++)
        d[i]=sc.nextInt();
    int[] e=new int[a];
    int[] f=new int[a]; 
int[] g=new int[a];
int x=0;
int y=0;
for(int i=0;i<a-1;i++){
    for(int j=0;j<i+1;j++)
    x+=d[j];
     for(int j=a-1;j>i;j--)
    y+=d[j];
if(x-y>=0)
g[i]=x-y;
else
g[i]=-(x-y);
    
    x=0;
    y=0;
}
int tmp=g[0];
int count=0;
for(int i=0;i<a-1;i++){
    if(tmp>=g[i])
{   
    tmp=g[i];
    count=i;
    
}
    
}


		System.out.println(g[count]);
	}
}
