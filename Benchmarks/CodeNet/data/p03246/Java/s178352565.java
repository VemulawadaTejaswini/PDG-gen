import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int count = 0;
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }
    
    if(a[0] == a[1]){
      a[1] = a[0] + 1;
      count++;
    }
    if(4 <= n){
      for(int i = 2; i < n; i += 2){
        if(a[0] != a[i]){
          count++;
        }
      }
      for(int i = 3; i < n; i += 2){
        if(a[1] != a[i]){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}