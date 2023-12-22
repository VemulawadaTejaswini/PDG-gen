import java.util.*;
class Main{
  public static void main(String args[])throws Exception{
    Scanner sc = new Scanner(System.in);
    int count = 0;
    int number = 0;
    static int n = sc.nextInt();
    static  int [] array_s = new int[n];
    for(int i =0; i<n; i++){
      array_s[i] = sc.nextInt();
    }

    int q = sc.nextInt();
    int t;
    for(int i = 0; i<q; i++){
      t = sc.nextInt();
      //二分探索
      count +=binarysearch(t, array_t);
    }
    System.out.println(count);
  }

  static int binarysearch(int i , int a[]){
    int left = 0;
    int right = n;
    int mid;
    while(left<right){
      mid = (left+right)/2;
      if(mid==a[i])return 1;
      else if(key<a[i])right=mid;
      else left = mid+1;
    }
    return 0;
  }
}
