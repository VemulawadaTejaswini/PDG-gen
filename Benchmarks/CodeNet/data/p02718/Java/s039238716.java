import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int m = sc.nextInt();
     int[] a = new int[n];
     int sum=0;
     for(int i=0;i<n;i++){
       a[i]=sc.nextInt();
       sum+=a[i];
     }
     quick_sort(a,0,n-1);
     if(a[n-m]<sum/(4*m)){
       System.out.println("No");
     }else{
       System.out.println("Yes");
     }
   }
   static void quick_sort(int[] d, int left, int right) {
        if (left>=right) {
            return;
        }
        int p = d[(left+right)/2];
        int l = left, r = right, tmp;
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
