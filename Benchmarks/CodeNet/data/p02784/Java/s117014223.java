import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    int h = sc.nextInt();
    int n = sc.nextInt();
        
    int sum = 0;
    String ans;
    
    for(int i=0; i<n; i++){
      sum += sc.nextInt();
    }
    
    if(sum >= h){
      ans = "Yes";
    } else {
      ans = "No";
    }
    
    System.out.println(ans);
  }
}