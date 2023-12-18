import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean flg = true;
    int[] a = new int[n];
    for(int i = 0;i<n;i++){
      a[i] = sc.nextInt();
    }
    for(int i = 0;i<n;i++){
      if(i==0){
        if((a[n-1]^a[1])!=a[i]){
          flg = false;
          break;
        }
      }else if(i==n-1){
         if((a[n-2]^a[0])!=a[i]){
          flg = false;
           break;
        }
      }else if((a[i-1]^a[i+1])!=a[i]){
        flg = false;
        break;
      }
    }
    if(flg){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    } 
  } 
}