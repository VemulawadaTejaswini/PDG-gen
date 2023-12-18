import java.util.*;
import java.util.Arrays;
import java.util.Collections;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] R = new int[N];
    for(int i = 0;i<N;i++){
      R[i]=sc.nextInt();
      }
    int r = 0;
    Arrays.sort(R);
    int[] L = new int[N];
    for(int i  = 0;i<N;i++){
      L[i]=R[N-1-i];
    }
    for (int i = 0;i<N-2;i++){
      for(int k = i+1;k<N-1;k++){
        int invm = -1;
        int invs = -1;
        int m = L[i]+L[k];
        int s = L[i]-L[k];
        for(int j = 0;invs == -1&&j<N-k;j++){
          if(invm == -1&&L[k+j]<m){
            invm = k+j;
          }else if(invs == -1&&L[k+j]<=s){
            invs = k+j-1;
          }
        }
        if(invs == -1) invs = N-1;
        if(invs>invm) r+=invs-invm;
      }
    }
    System.out.println(r);
  }
}