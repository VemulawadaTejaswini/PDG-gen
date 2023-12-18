import java.util.*;//ABC138-B,再度復習
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    double x = 0;
    double y = 0;

    for(int i=0 ; i<n ; i++){
      a[i] = sc.nextInt();
    }
    for(int i=0 ; i<n ; i++){
      x += 1/(double)a[i];
    }
    y = 1/(double)x;
    System.out.println(y);
  }
}
