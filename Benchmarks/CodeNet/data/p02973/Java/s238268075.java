import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    Queue<Integer> que = new ArrayDeque<>();
    
    int n = 0;
    int max = 0;
    for(int i = 0; i < N; i++){
      int a = Integer.parseInt(sc.nextLine());
      if(n < a){
        n = a;
      }else{
        que.add(n);
        max = max < que.size() ? que.size() : max;
        for(int j = 0; j < que.size()-1; j++){
          int b = que.poll();
          if(b < a){
            n = a;
            break;
          }else{
            que.add(b);
          }
        }
      }
    }
    System.out.println(max);
  }
}