import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
        int[] a = new int[n];
		for(int i=0;i<n;i++)
		  a[i] = sc.nextInt();
        //i番目
        
        int[] ans = new int[n];//正解順
        for(int i=0;i<n;i++)
           ans[a[i]-1]=i+1;
        for(int i=0;i<n;i++)
		  // 出力
		  System.out.print(ans[i]+" ");
	}
}