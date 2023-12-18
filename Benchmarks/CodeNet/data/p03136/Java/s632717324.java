import java.util.*;

class Calc{
    private int n;
    Calc(int n){
      this.n = n;
    }

    public String check(){
      Scanner sc = new Scanner(System.in);
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
      for(int i=0; i<n; i++){
        pq.add(sc.nextInt());
      }

      int max_num = pq.poll();
      int else_sum = 0;
      int size = pq.size();

      for(int i=0; i<size; i++){
        else_sum += pq.poll();
      }


      return (max_num < else_sum)? "Yes":"No";
    }


}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Calc c = new Calc(sc.nextInt());
    System.out.println(c.check());
  }
}