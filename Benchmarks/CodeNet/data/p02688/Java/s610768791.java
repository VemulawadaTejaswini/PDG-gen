import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int a[][] = new int[k][n];
    int count = 0;
    for(int i=0 ; i<k ; i++){
      int d = sc.nextInt();
      for(int j=0 ; j<d ; j++){
        a[i][j] = sc.nextInt();
      }
    }

    for(int i=0 ; i<k ; i++){
      for(int j=0 ; j<n ; j++){
        for(int l=1 ; l<=n ; l++){
          if(a[i][j] ==l){
            count++;
          }
        }
      }
    }
    System.out.println(((k*n)-count)/n);
  }
}
