import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int t=sc.nextInt();
    int[] cost=new int[n];
    int[] time=new int[n];
    int ans=10000;
    for(int i=0;i<n;i++) {
      cost[i]=sc.nextInt();
      time[i]=sc.nextInt();
      if(time[i]<=t) {
        if(cost[i]<ans){
          ans=cost[i];
        }
      }
    }
    if(ans==10000) {
      System.out.println("TLE");
    } else {
      System.out.println(ans);
    }
  }
}
