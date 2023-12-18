import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    
    String[] S = sc.nextLine().split(" ");
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i < N; i++){
      list.add(Integer.parseInt(S[i]));
    }
    
    Deque<Integer> deq = new ArrayDeque<>();
    while(list.size() > 0){
      int n = list.size();
      for(int i = n-1; i >= 0; i--){
        if(list.get(i) == i+1){
          list.remove(i);
          deq.push(i+1);
          break;
        }
      }
      if(list.size() == n){
        System.out.println(-1);
        return;
      }
    }
    
    while(deq.size() > 0){
      System.out.println(deq.pop());
    }
  }
}