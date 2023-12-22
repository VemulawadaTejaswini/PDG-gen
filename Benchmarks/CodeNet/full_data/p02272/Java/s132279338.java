import java.util.*;
public class Main{
    public static int cnt = 0;
    public static void merge(int[] A,int left,int right,int mid){
        // int n1 = mid - left;
        // int n2 = right - mid;
        // int l[] = new int[n1+1];
        // int r[]  = new int[n2+1];
        // for (int i = 0; i < n1-1; i++) {
        //   l[i]= A[left + i];
        // }
        // for (int i = 0; i < n2-1; i++) {
        //   r[i]= A[i + mid];
        // }
        //  l[n1] = r[n2] = Integer.MAX_VALUE;
        // int i = 0,j = 0;
        // for(int k = left;k <= right-1;k++){
        //   cnt++;
        //   if(l[i] <= r[j]){
        //     A[k] = l[i];
        //     i = i + 1;
        //   }
        //   else{
        //     A[k] = r[j];
        //     j = j + 1;
        //   }
        // }
      int n1 = mid - left;
      int n2 = right - mid;
      int[] l = new int[n1 + 1];
      int[] r = new int[n2 + 1];
      for (int i = 0; i < n1; i++) {
        l[i] = A[left + i];
      }
      for (int i = 0; i < n2; i++) {
        r[i] = A[mid + i];
      }
      l[n1] = Integer.MAX_VALUE;
      r[n2] = Integer.MAX_VALUE;

      int L = 0;
      int R = 0;
      for (int k = left; k < right; k++) {
        if (l[L] <= r[R]) {
          A[k] = l[L++];
        } else {
          A[k] = r[R++];
        }
        cnt++;
      }
    }
    public static void mergesort(int[] A,int left,int right){
      if(left + 1 < right){
        int mid = (left + right)/2;
        mergesort(A,left,mid);
        mergesort(A,mid,right);
        merge(A,left,right,mid);
      }

    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] A = new int[n];
      for(int i = 0; i < n; i++){
        A[i] = sc.nextInt();
      }
      mergesort(A,0,n);
      for(int i = 0;i<n-1;i++){
        System.out.print(A[i]+" ");
      }
      System.out.println(A[n-1]);
      System.out.println(cnt);
    }
}

