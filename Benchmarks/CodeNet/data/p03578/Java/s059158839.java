import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i < N; i++){
      list.add(Integer.parseInt(S[i]));
    }
    
    int M = Integer.parseInt(sc.nextLine());
    String[] T = sc.nextLine().split(" ");
    String ans = "YES";
    for(int i = 0; i < M; i++){
      int n = Integer.parseInt(T[i]);
      if(list.indexOf(n) == -1){
        ans = "NO";
        break;
      }else{
        list.remove(list.indexOf(n));
      }
    }
    System.out.println(ans);
  }
}