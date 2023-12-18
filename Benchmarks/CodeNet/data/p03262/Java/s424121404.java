import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int X = Integer.parseInt(S[1]);
    String[] T = sc.nextLine().split(" ");
    List<Integer> list = new ArrayList<>();
    list.add(X);
    
    for(int i = 0; i < N; i++){
      list.add(Integer.parseInt(T[i]));
    }
    Collections.sort(list);
    int ans = 1000000000;
    for(int i = 1; i <= N; i++){
      int n = Math.abs(list.get(i) - list.get(i-1));
      ans = n < ans ? n : ans;
    }
    
    for(int i = 0; i <= N; i++){
      int n = Math.abs(list.get(i)-X);
      if(n%ans != 0){
        ans = 1;
      }
    }
    
    System.out.println(ans);
  }
}