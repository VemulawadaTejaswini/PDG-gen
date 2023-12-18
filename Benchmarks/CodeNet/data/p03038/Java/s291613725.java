import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     int M = sc.nextInt();
     long[] A = new long[N];
     long C,element,ans;
     int index,y,B;
     ans = 0;
     for(int i = 0;i<N;i++){
      A[i] = sc.nextInt();
     }
     quick_sort(A,0,N-1);
     for(int j = 0;j<M;j++){
       B = sc.nextInt();
       C = sc.nextInt();
       index = 0;
       while(A[index] < C && index<N-1){
         index++;
       }
       if(index>B){
         for(int i=0;i<index-B;i++){
           A[i]=A[B+i];
         }
         for(int i=index-B;i<index;i++){
           A[i]=C;
         }
       }else{
         for(int i = 0;i<index;i++){
           A[i] = C;
         }
       }
     }
     for(int i=0;i<N;i++){
       ans += A[i];
     }
     System.out.println(ans);
   }
   static void quick_sort(long[] d, int left, int right) {
        if (left>=right) {
            return;
        }
        long p = d[(left+right)/2],tmp;
        int l = left, r = right;
        while(l<=r) {
            while(d[l] < p) { l++; }
            while(d[r] > p) { r--; }
            if (l<=r) {
                tmp = d[l]; d[l] = d[r]; d[r] = tmp;
                l++; r--;
            }
        }
        quick_sort(d, left, r);  // ピボットより左側をクイックソート
        quick_sort(d, l, right); // ピボットより右側をクイックソート
    }
}
