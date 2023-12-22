import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    // Arrays.sort(array, Comparator.reverseOrder());
    long [] a = new long[N];
    for(int i = 0;i<N;i++){
      a[i] = sc.nextLong();
    }
    Arrays.sort(array, Comparator.reverseOrder());
    long sum = a[0];
    for(int i = 1;i<N/2;i++){
      sum += a[i]*2;
    }
    System.out.println(sum-min);
  }
}