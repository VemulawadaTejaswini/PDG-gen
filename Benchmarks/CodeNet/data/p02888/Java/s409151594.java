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
        int m = L[i]+L[k];
        int s = L[i]-L[k];
        int Mstart = 0;
        int Sstart = 0;
        if(L[k+(N-k)/2]>=m) Mstart = (N-k)/2;
        if(L[k+(N-k)/2]>s) Sstart = (N-k)/2;
        int kari = k + Mstart;
        for(int j = 1;j< 1 + (N-k)/2;j++){
          if(invm == -1 &&kari+j<N&&L[kari+j]<m){
            invm = kari + j - 1;
          }
          if(invs ==-1 &&kari+j<N&&L[kari+j]<=s){
            invs = kari + j - 1;
          }
        }
        if(invs == -1) invs = N-1;
        if(invs>invm) r+=invs-invm;
      }
    }
    System.out.println(r);
  }
}
