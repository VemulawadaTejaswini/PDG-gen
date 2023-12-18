import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  int N = sc.nextInt();
	  int[] A = new int[N];
	  int[] B = new int[N];
	  int[] C = new int[N];
	  int count = 0;
	  for(int i=0; i<N; i++) {
		  A[i] = sc.nextInt();
	  }
	  for(int i=0; i<N; i++) {
		  B[i] = sc.nextInt();
	  }  
	  for(int i=0; i<N; i++) {
		  C[i] = sc.nextInt();
	  }  
	  //昇順にソート
	  Arrays.sort(A);
	  Arrays.sort(B);
	  Arrays.sort(C);
	  
	  for(int i=0; i<A.length; i++) {
		  int j = binarySearch(A[i], B);
		  for(; j<B.length; j++) {
			  int k = binarySearch(B[j], C);//A[i]<B[j]<Cを満たすCの最初の座標
			  int m = C.length - k; //A[i]<B[j]<Cを満たすCの要素数
			  count += m;	  
		  }
	  }
	  out.println(count);
	  

  }
  //二分探索。【引数】探す数字、リスト【戻り値】list内でnより大きい数が最初に現れる座標
	public static int binarySearch(int n, int[] list){
		
		int left = 0, right = list.length - 1;  //探索範囲
		int center = 0; //配列の中央
		int num;
		
		while(left < right) {
			center = (left + right) / 2;
			if (list[center] > n) {
				right = center - 1;
			} else if( list[center] < n) {
				left = center + 1;
			} else break;		
		}
		num = left; //rightでも良いはず
		if(list[num] <= n) num++;
		return num;
	}
}