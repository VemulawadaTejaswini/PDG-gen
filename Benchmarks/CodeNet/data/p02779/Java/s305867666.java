import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    Set<Integer> set = new HashSet<>();
    for(int i = 0; i < N; i++){
      set.add(Integer.parseInt(sc.next()));
    }
    System.out.println(N == set.size() ? "YES" : "NO");
  }
}