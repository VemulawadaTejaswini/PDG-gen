import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> ar = new ArrayList<Integer>();
    int N = sc.nextInt();
    int X = sc.nextInt();
    int ans = N;
    for(int i=0;i<N;i++){
      int m = sc.nextInt();
      ar.add(m);
      X -= m;
    }
    Collections.sort(ar);
    while(X>0){
      X -= ar.get(0);
      if(X>0){
        ans++;
      }
    }
    System.out.println(ans);
  }
}
