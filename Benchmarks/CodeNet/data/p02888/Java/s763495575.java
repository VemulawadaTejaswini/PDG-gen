import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      int[] L = new int[n];
      for(int i=0;i<n;i++){
        L[i] = Integer.parseInt(sc.next());
      }

      Arrays.sort(L);

      int cnt = 0;

      int max1 = 0;
      int max2 = 0;

      for(int i=n-1;i>0;i--){
        for(int j=i-1;j>0;j--){
          int start = j-1;
          int end = 0;
          int mid = (start+end)/2;
          int a = 0;
          int ok = 0;
          while(true){
            //System.out.println("i="+i+" j="+j);
            //System.out.println("start="+start);
            //System.out.println("end="+end);
            //System.out.println("mid="+mid);
            a = L[mid];
            if(L[mid]>L[i]-L[j]){ //ok
              start = mid;
              end = end;
              mid = (start+end)/2;
              ok = 1;
            }
            else{ //nok
              start = start;
              end = mid;
              mid = (start+end)/2;
              ok = 0;
            }
            if(a==L[mid]){
              break;
            }
          }
          if(ok==1){
            cnt += j - mid;
          }
          //System.out.println("ok="+ok);
          //System.out.println("cnt+="+ (j - mid -1));
          //System.out.println("");
        }
      }


      System.out.println(cnt);

    }
}
