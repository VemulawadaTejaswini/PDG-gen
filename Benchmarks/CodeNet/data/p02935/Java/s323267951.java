import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] a = new int[n];
    for (int i=0;i<n;i++){
      a[i] = scan.nextInt();
    }
    Arrays.sort(a);
    long gg = (long) Math.pow(2,n-1);
    double sum = (double) a[0]/gg;
    for (int j=1;j<n;j++){
      long power = (long) Math.pow(2,n-j);
      sum += (double) a[j]/power;
    }
    System.out.println(sum);

  }
}
