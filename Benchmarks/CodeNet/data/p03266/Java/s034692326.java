import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    long sum = 0;
    for (int i=1;i<=(int) Math.min(n,k);i++){
      int a = i;
      int b = k-i;
      if ( ( ((2*k-2*i) % k) != 0) || ((k-i) > n)){
        continue;
      }

      sum += find(i,n,k)*find(k-i,n,k)*find(k-i,n,k);
    }
    System.out.println(sum);


  }

  static int find(int start, int n, int k){
    if (start == 0){
      start = k;
    }
    int count = 0;
    while(start <= n){
      start += k;
      count += 1;
    }
    return count;
  }
}
