import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a[] = new int[m];
    int total = 0;
    for(int i=0 ; i<m ; i++){
      a[i] = sc.nextInt();
    }
    for(int i=0 ; i<m ; i++){
      total = total + a[i];
    }
    if(total <=n){
      System.out.println(n-total);
    }else{
      System.out.println(-1);
    }
  }
}
