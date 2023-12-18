import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  int N = sc.nextInt();
	  int[] L = new int[N];
	  for(int i=0; i<N; i++)
		  L[i] = sc.nextInt();
	  int sum = 0;
	  
	  Arrays.sort(L);
	  
	 for(int i=N-1; i>1; i--) {
		 for(int j=0; j+1<i; j++ ) {
			 int index = meguruSearch(L,j,i);
			 int count = i-index;
			 sum += count;
		 }
	 }
	  	 
	  out.println(sum);
  	}
    //二分探索。左端、右端は毎回変わる
	static int meguruSearch( int[] list, int left, int right) {
		int Left = left;
		int Right = right;
		
		while (right - left > 1) {
			int mid = left + (right - left) / 2;
			if(lower_bound(mid, list, Left, Right)) right = mid; 
			else left = mid;
		}		
		return right;		
	}
	//条件判定
	static boolean lower_bound(int index, int[] list, int Left, int Right) {
		if( list[Left] + list[index] > list[Right]) return true;
		else return false;
	}
  }	