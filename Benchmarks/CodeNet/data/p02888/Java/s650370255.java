import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] l = new int[n];
    for (int i = 0;i<n ;i++ ) {
      l[i] = sc.nextInt();
    }
    Arrays.sort(l);
    int count = 0;
    for(int i = n-1;i>1;i--){
      for(int j = i-1;j>0;j--){
        int a = BinarySearch(l,l[i]-l[j]+1);
        if(a < j){
          count += j - a;
        }
      }
    }
    System.out.println(count);
  }

  public static int BinarySearch(int a[] , int target){
    int left = -1;
    int right = a.length;
    while(right - left > 1){
      int mid = left + (right - left) / 2;
      if(a[mid] >= target){
        right = mid;
      }else{
        left = mid;
      }
    }
    return right;
  }

}
