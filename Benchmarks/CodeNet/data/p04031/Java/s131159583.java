import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    sc.close();
    Arrays.sort(a);
    int cost[]=new int[a[n-1]-a[0]+1];
    for(int i=0;i<cost.length;i++){
      for(int j=0;j<n;j++){
        cost[i]+=Math.pow((a[0]+i-a[j]),2);
      }
    }
    Arrays.sort(cost);
    System.out.println(cost[0]);
  }
}