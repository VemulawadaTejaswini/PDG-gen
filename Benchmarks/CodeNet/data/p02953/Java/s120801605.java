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
    boolean p = true;

    switch(n) {
      case 1 :
           PL(p);
           break ;
      case 2 :
           if(a[0]-1>a[1]){
             p = false;
           }
           PL(p);
           break ;
      default :
          for(int j=0; j<n-1; j++){
            if(j==0 && a[0]>a[1]){
              a[0] = a[0]-1;
              if(a[0]>a[1]){
                p = false;
              }
            }
            if(j!=0 && a[j]>a[j+1]){
              a[j] = a[j]-1 ;
              if(a[j-1]>a[j] || a[j]>a[j+1]){
                p = false;
              }
            }
          }
          PL(p);
          break ;
    }

  }

  public static void PL(boolean a){
    if(a){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}