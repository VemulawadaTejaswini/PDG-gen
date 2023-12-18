import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int cnt=0;
      int ARC=0;
      int ABC=0;
      int max=0;

      int[] d = new int[n];

      for(int i=0;i<n;i++){
        d[i] = sc.nextInt();
      }

      for(int i=0;i<n;i++){
        max = Math.max(max,d[i]);
      }

      for(int k=0;k<max;k++){
        for(int i=0;i<n;i++){
          if(d[i]<k){
            ABC++;
          }
          else{
            ARC++;
          }
        }
        if(ABC==ARC){
          cnt++;
        }
        ABC=0;
        ARC=0;
      }

      System.out.println(cnt);

    }
}
