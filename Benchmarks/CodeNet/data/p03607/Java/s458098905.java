import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    Set<Integer> set = new HashSet<>();
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.nextLine());
      if(set.contains(n)){
        set.remove(n);
      }else{
        set.add(n);
      }
    }
    System.out.println(set.size());
  }
}