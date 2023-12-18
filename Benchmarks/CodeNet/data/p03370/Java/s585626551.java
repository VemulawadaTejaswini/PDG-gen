import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> ar = new ArrayList<Integer>();
    int N = sc.nextInt();
    int X = sc.nextInt();
    int cost = 0;
    int ans = N;
    for(int i=0;i<N;i++){
      int m = sc.nextInt();
      ar.add(m);
      cost += m;
    }
    Collections.sort(ar);
    while(cost<X){
      cost += ar.get(0);
      if(cost<X){
        ans++;
      }
    }
    System.out.println(ans);
  }
}
