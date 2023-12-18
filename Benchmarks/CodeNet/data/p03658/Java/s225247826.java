import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int[] c=new int[a];
		for(int i=0;i<a;i++)
	 c[i] = sc.nextInt();
int tmp=0;
int j=0;
int[] d=new int[b];
int ans=0;
int count=0;
for(int i=0;j<b;i++){
  
    if(tmp<c[i]){
    tmp=c[i];
    count=i;
    }
    if(i==a-1){
        c[count]=0;
        i=0;
        d[j]=tmp;
        j++;
        tmp=0;
    }
    
 }
 for(int i=0;i<b;i++)
 ans+=d[i];
 // 文字列の入力
		//String s = sc.next();
		// 出力
		System.out.println(ans);
	}
}
