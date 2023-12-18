import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int a = scan.nextInt();
    int b = scan.nextInt();

    long[] c = new long[n];

    int pre = scan.nextInt();

    for (int i=0;i<n-1;i++){
      int x = scan.nextInt();
      long dis = (x-pre)*a;
      pre = x;
      c[i] = dis;
    }

    Arrays.sort(c);

    long sum = 0;
    for (int i=0;i<n;i++){
      if (c[i] >= b){
        sum += b*(n-i);
        break;
      }
      sum += c[i];
    }
    System.out.println(sum);

  }

}
