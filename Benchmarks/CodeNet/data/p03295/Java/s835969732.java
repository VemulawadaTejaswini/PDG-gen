import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
 
class demand implements Comparable{
  int from;
  int to;
 
  public int compareTo(Object other){
    demand otherdemand = (demand)other;
    return to - otherdemand.to;
  }
}
 
public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
    int n = sc.nextInt();
    int m = sc.nextInt();


    demand[] demands = new demand[m];

    for(int i = 0; i < m; i++){
      demand newdemand = new demand();
      newdemand.from = sc.nextInt();
      newdemand.to = sc.nextInt();
      demands[i] = newdemand;
    }

    Arrays.sort(demands);

    int ans = 0;
    int nowclear = 0;
    for(int i = 0; i < m; i++){
      int nowfrom = demands[i].from;
      int nowto = demands[i].to;
      if(nowclear < nowfrom){
        ans++;
        nowclear = nowto - 1;
      }
    }

    System.out.println(ans);
 
  }
} 