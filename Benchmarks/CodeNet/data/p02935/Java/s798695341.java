import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int a[] = new int[n];
        
    for(int i=0;i<n;i++){
      a[i] = Integer.parseInt(sc.next());
    }

    for(int i=0;i<n-1;i++){
      for(int j=n-1;j>i;j--){
        if(a[j-1] > a[j]){
          int tmp = a[j];
          a[j] = a[j-1];
          a[j-1] = tmp;
        }
      }
    }
    for(int i=0;i<n-1;i++){
      a[i+1] = (a[i]+a[i+1])/2;
    }
    System.out.println(a[n-1]);
  }
}