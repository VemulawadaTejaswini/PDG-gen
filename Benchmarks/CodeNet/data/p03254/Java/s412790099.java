import java.util.*;
 
public class Main {
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = sc.nextInt();
    int a[] = new int[N];
    
    for(int i=0; i<N; i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int cnt = 0;
    int sum = 0;
    for(int i=0; i<N; i++){
      if(sum<=x){
      sum = sum+a[i];
      cnt++;
      }
    }
    System.out.print(cnt);
  }
}