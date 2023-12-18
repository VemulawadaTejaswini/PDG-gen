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
        int invm = -1;
        int invs = -1;
        int max = N-1;
        int min =0;
        int s = L[i]-L[k];
        for(int j=k+1;j<N;j++){
			if(L[j]>s){
              r++;
            }
        }

      }
    }
    System.out.println(r);
  }
}