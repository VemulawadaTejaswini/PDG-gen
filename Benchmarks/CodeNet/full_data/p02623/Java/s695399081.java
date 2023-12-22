import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    ArrayDeque<Integer> deskA = new ArrayDeque<>();
    ArrayDeque<Integer> deskB = new ArrayDeque<>();
    for(int i = 0; i < n; i++){
      deskA.add(sc.nextInt());
    }
    deskA.add(Integer.MAX_VALUE);
    for(int i = 0; i < m; i++){
      deskB.add(sc.nextInt());
    }
    deskB.add(Integer.MAX_VALUE);
    int counter = 0;
    int timeA = deskA.poll();
    int timeB = deskB.poll();
    while(Math.min(timeA, timeB) <= k){
      counter++;
      if(timeA > timeB){
        k -= timeB;
        timeB = deskB.poll();
      } else {
        k -= timeA;
        timeA = deskA.poll();
      }
    }
    System.out.println(counter);
  }
}
