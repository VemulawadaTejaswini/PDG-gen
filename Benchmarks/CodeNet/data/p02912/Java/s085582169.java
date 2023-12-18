import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int m = sc.nextInt();
        long[] a = new long[n];
        for(int i=0;i<n;i++)
          a[i] = sc.nextLong();
      
      
      //aの各値の最大値を削減することを枚数文繰り返す
     
      for(int i=0;i<m;i++){//チケット枚数文
         Arrays.sort(a);
        a[n-1]=disc(a[n-1],1);
        
      }
		// 出力
      long sum = 0;
      for(int i=0;i<n;i++){
        sum+=a[i];
		//System.out.println(a[i]);
      }
      System.out.println(sum);
	}


	public static long disc(long x,int y){
      
     return (long)(x/Math.pow(2,y));
    }
}