import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int n = sc.nextInt();
      int r = sc.nextInt();
      if(n==0&&r==0){
        break;
      }
      int[] a = new int[n];
      for(int i=n;i>=1;i--){
        a[n-i] = i;
       // System.out.println(a[n-i]);
      }
      for(int k=0;k<r;k++){
          int p = sc.nextInt();
          int c = sc.nextInt();
          for(int i=0;i<c;i++){
            for(int j=p;j>=2;j--){
            int temp;
            temp = a[j+i-1];
            a[j+i-1] =a[j+i-2];
            a[j+i-2] = temp;
            }
           /* for(int j=0;j<n;j++){
           // System.out.println(a[j]);
              }*/
          }
      }
      System.out.println(a[0]);
    }
  }
}
