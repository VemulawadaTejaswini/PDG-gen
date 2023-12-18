import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);

    int sum_a=0;
    int sum_b=0;

    for(int i=0;i<n;i++){
      if((i%2)==0){
        sum_b += a[i];
      }else{
        sum_a += a[i];
      }
    }
    System.out.println(Math.abs(sum_a - sum_b));
  }
}