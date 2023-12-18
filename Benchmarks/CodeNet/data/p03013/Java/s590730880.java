import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n=sc.nextInt();
      int m=sc.nextInt();

      int flag = 1;
      int ans;

      int[] a = new int[m+1];
      for(int i=1;i<m+1;i++){
        a[i]=sc.nextInt();
      }

      //////////ERROR//////////////////////
      for(int i=1;i<m;i++){
        if(a[i+1]==a[i]+1){
          flag = 0;
          break;
        }
      }
      ////////////////////////////////////
      int[] way = new int[n+1];
      if(flag==1){

      if(n==1){
        way[n] = 1;
      }
      else if(n==2){
        way[n] = 2;
      }
      else{
/////////////////////////main////////////////////////////////////////
        if(a[1]!=1){
          way[1] = 1;
        }
        else{
          way[1] = 0;
        }

        if(a[1]!=2 || a[2]!=2){
          way[2] = 2;
        }
        else{
          way[2] = 0;
        }

        int ccnt=0;
        for(int i=3;i<n+1;i++){
          for(int j=ccnt;j<m+1;j++){
            if(way[i]==a[j]){
              way[i] = -1;
              ccnt++;
              break;
            }
          }
        }

        for(int i=3;i<n+1;i++){
          if(way[i]!=-1){
            way[i] = way[i-1] + way[i-2];
          }
          else{
            way[i] = 0;
          }
        }


/////////////////////////////////////////////////////////////////////
      }



    }


    ans = way[n] % 1000000007;


      if(flag==0){
        System.out.println("0");
      }
      else{
        System.out.println(ans);
      }

    }
}
