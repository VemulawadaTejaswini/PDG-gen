import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    Queue<Integer> que = new ArrayDeque<>();
    int k = sc.nextInt();
      int num = 0;
      for(int i = 1 ; i <= 9 ; i++){
        que.add(i);
      }
    while(k > 0){
    int i = que.poll();
      num = i;
      k--;
      if(i % 10 != 0)
        que.add(i * 10 + i % 10 - 1);
      que.add(i * 10 + i % 10);
      if(i % 10 != 9)
        que.add(i * 10 + i % 10 + 1);
    }
      System.out.println(num);
	}
}