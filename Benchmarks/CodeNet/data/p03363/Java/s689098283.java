import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[n+1];
    int count = 0;
    for(int i=0 ; i<n ; i++){
      a[i] = sc.nextInt();
    }
    for(int i=0 ; i<n+1 ; i++){
      if(i==0){
        b[0] = 0;
        // System.out.print(b[i]+" ");
      }else{
        b[i] = b[i-1] + a[i-1];
        // System.out.print(b[i]+" ");
      }
    }
    // System.out.println();

    for(int i=0 ; i<n+1 ; i++){
      for(int j=n ; j>i ; j--){
        if(b[i] == b[j]){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
