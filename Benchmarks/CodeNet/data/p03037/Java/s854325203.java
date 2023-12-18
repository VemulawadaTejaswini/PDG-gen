import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());
      int m = Integer.parseInt(sc.next());

      int[] L = new int[m];
      int[] R = new int[m];


      for(int i=0;i<m;i++){
        L[i] = Integer.parseInt(sc.next());
        R[i] = Integer.parseInt(sc.next());
      }

      int max = cmax(L,m);
      int min = cmin(R,m);

      int ans = min - max + 1;

      if(ans>=0){
        System.out.println(ans);
      }
      else{
        System.out.println("0");
      }

    }

    public static int cmax(int[] aa,int nn){
      int max1=aa[0];
      for(int j=1;j<nn;j++){
        if(aa[j]>max1){
          max1=aa[j];
        }
      }
      return max1;
    }
    public static int cmin(int[] bb,int nn){
      int min1=bb[0];
      for(int j=1;j<nn;j++){
        if(bb[j]<min1){
          min1=bb[j];
        }
      }
      return min1;
    }

}
