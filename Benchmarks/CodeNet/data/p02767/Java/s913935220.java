import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x[] = new int[n];
    int total[] = new int[101];
    for(int i=0 ; i<n ; i++){
      x[i] = sc.nextInt();
    }
    for(int j=0 ; j<=100 ; j++){
      for(int i=0 ; i<n ; i++){
        total[j] = total[j] + (x[i]-j)*(x[i]-j);
      }
    }
    Arrays.sort(total);
    // for(int i=0 ; )
    System.out.println(total[0]);
  }
}
