import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int h ;
    int[] a = new int[n];

    for(int i=0; i<n; i++){
      h = sc.nextInt();
      a[i] = h ;

    }
    if(n==1){
      System.out.println("Yes");
    }else{
      for(int j=0; j<n-1; j++){
        if(a[j]>a[j+1]){
          a[j] = a[j]-1;
          if(j==0 && a[j]>a[j+1]){
            System.out.println("No");
            return ;
          }
          if(a[j-1]>a[j] || a[j]>a[j+1]){
            System.out.println("No");
            return ;
          }
        }
      }
      System.out.println("Yes");
    }
  }
}