import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int v = sc.nextInt();
    int b = sc.nextInt();
    int w = sc.nextInt();
    int t = sc.nextInt();
    
    int max = 1000000000;
    int min = -1000000000;
    
    int d = Math.abs(a-b);

    String ans = "NO";
    
    if(w < v && d <= (v-w)*t){
      ans = "YES";
    } else if (a < b && v*t >= max-a){
      ans = "YES";
    } else if (a > b && v*t >= Math.abs(min-a)){
      ans = "YES";
    } 
    
    System.out.println(ans);
  }
}
