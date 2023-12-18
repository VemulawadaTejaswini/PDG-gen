import java.util.*;
import java.util.Arrays;
import java.util.Collections;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Integer[] L= new Integer[N];
    for(int i = 0;i<N;i++){
      L[i]=sc.nextInt();
      }
    int r = 0;
    Arrays.sort(L,Collections.reverseOrder());
    for (int i = 0;i<N-2;i++){
      for(int k = i+1;k<N-1;k++){
        int s = L[i]-L[k];
        for(int j=k+1;j<N;j++){
			if(L[j]<=s){
              r+=j-k-1;
              break;
            }
            if(L[j]>s&&j==N-1){
              r+=N-k-1;
            }
        }

      }
    }
    System.out.println(r);
  }
}