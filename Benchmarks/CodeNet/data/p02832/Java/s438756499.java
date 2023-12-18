import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] a = new int[n];
    int i;
    int m;
    int total = 0;
    for(i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    for(i=0,m=0;i<n;i++){
      if(a[i]==1){
        m += 1;
      }
    }
    if(m==0){
      System.out.println(-1);
      System.exit(0);
    }
    for(i=0,m=1;i<n;i++){
      if(a[i]!=m){
        total += 1;
      }else{
        m++;
        continue;
      }
    }
    System.out.println(total);
    }
 }

