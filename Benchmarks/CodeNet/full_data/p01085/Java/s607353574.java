import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    while(true){
      int n = s.nextInt();
      int min = s.nextInt();
      int max = s.nextInt();

      if(n==0 && min==0 && max==0){
        break;
      }
      int[] a = new int[n];
      for(int i=0; i<n; i++){
        a[i] = s.nextInt();
      }

      int ans = 0;
      int m = 0;

      for(int i=min; i<=max; i++){
        int l = a[i-1] - a[i];
        if(m <= l){
          ans = i;
          m = l;
        }
      }

      System.out.println(ans);
    }

  }
}
