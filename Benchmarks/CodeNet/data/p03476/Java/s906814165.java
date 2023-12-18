import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int q = scan.nextInt();
    long sum = 0;
    while (q > 0){
      sum = 0;
      int l = scan.nextInt();
      int r = scan.nextInt();
      for (int i=l;i<=r;i++){
        sum += find(i);
      }
      System.out.println(sum);
      q--;
    }
  }

  static int find(int n){
    if (n == 3){
      return 1;
    }

    if (n%4 == 1){
      int a1 = (int) (n+1)/2;
      int a2 = 0;

      a2 += check(n);
      a2 += check(a1);

      if (a2 > 0){
        return 0;
      }
      return 1;


    }
    else{
      return 0;
    }
  }

  static int check(int n){
    int g = (int) Math.sqrt(n);

    if (g*g == n){
      return 1;
    }

    for (int i=g;i>=2;i--){
      if (n % i == 0){
        return 1;
      }
    }

    return 0;
  }

}
