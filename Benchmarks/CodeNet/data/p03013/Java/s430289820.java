import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n=sc.nextInt();

      int flag = 1;

      int[] a = new int[n];

      for(int i=0;i<n;i++){
        a[i]=sc.nextInt()-1;
      }

      //////////ERROR//////////////////////
      for(int i=0;i<m-1;i++){
        if(a[i+1]==a[i]+1){
          flag = 0;
          break;
        }
      }
      ////////////////////////////////////

      int[] way = new int[n];
      way[0] = 1;
      way[1] = 2;
      int ccnt = 0;
      //////////broken record///////////////
      for(int i=1;i<n;i++){
        for(int j=ccnt;j<m;j++){
          if(i==a[j]){
            way[i] = -1;
            ccnt++;
            break;
          }
        }
      }
      /////////////////////////////////////


      for(int i=2;i<n;i++){
        if(way[i]!=-1){
          way[i] = way[i-1] + way[i-2];
        }
        else{
          way[i] = 0;
        }
      }

      int ans = way[n-1] % 1000000007;

      if(flag==0){
        System.out.println("0");
      }
      else{
        System.out.println(ans);
      }

    }
}
