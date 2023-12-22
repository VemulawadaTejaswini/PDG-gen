import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();

    int a[] = new int[n+1];
    a[0] = 0;
    for(int i = 1 ; i < n+1 ; ++i){
      a[i] = sc.nextInt();
    }
    
    int count = 0;
 
    for(int i = 1 ; i < n+1 ; ++i){
      if(i%2==1 && a[i]%2==1){
        count++;
      }
    }
    
    System.out.println(count);
    
  }
}