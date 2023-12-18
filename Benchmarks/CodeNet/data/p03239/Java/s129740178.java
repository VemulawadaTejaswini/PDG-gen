import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int cost = sc.nextInt();
    int time = sc.nextInt();
    for(int i=0; i<n-1; i++){
      int c1 = sc.nextInt();
      int t1 = sc.nextInt();
      if(t1 <= time){
         time = t1;
         if(c1 < cost)
           cost = c1;
      }
    }
    if(time > t)
      System.out.println("TLE");
    else
      System.out.println(cost);
  }
}