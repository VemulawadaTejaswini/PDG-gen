import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int n = sc.nextInt();
    int[] a = new int[n-1];
    int[] b = new int[n];
    for(int i = 0;i < n-1; i++){
      a[i] = sc.nextInt();
      if(i == 0){
        b[i] = a[i];
        b[i+1] = a[i];        
      }else if(a[i] > a[i-1]){
        b[i+1] = a[i];
      }else{
        b[i] = a[i];
        b[i+1] = a[i];
      }
    }
    for(int i =0;i<n;i++){
      sum += b[i];
    }
    System.out.println(sum);
  }
}