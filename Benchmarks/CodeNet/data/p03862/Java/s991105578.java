import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i<n; i++) {
      a[i] = sc.nextInt();
    }

    int count = 0;

    if(a[0]>x){
      a[0] = x;
      count += a[0]-x;
    }

    for(int i = 0; i<n-1; i++){
      if(a[i]+a[i+1]>x){
        int needToEat = a[i]+a[i+1] - x;
        a[i+1] -= needToEat;
        count += needToEat;
      }
    }
    System.out.println(count);
  }
}
