import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int cnt = 0;
    for(int i = 1; i<n/2; i++){
     for(int j = i+1; j < n; j++){
      if(n==i+j){
        cnt++;
      }
     }
      
    }
    System.out.println(cnt);
    
  }
}
