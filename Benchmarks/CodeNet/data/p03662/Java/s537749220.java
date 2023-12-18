import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(in.readLine());

    Map<Integer, List<Integer>> v = new HashMap<>();
    for(int i=0;i<N+1;i++){
      v.put(i, new ArrayList<Integer>());
    }
    for(int i=0;i<N-1;i++){
      Integer[] ab = Arrays.stream(in.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
      v.get(ab[0]).add(ab[1]);
      v.get(ab[1]).add(ab[0]);
    }
    int f_socre = 0, s_score = 0;

    Queue<Integer> q = new LinkedList<Integer>();
    q.add(1);
    for(int i=0;i<N;i++){
      if(q.size() == 0){
        break;
      }
      Integer j = q.remove();
      if(j == N){
        continue;
      }else{
        q.addAll(v.get(j));
      }
      f_socre++;
    }

    q = new LinkedList<Integer>();
    q.add(N);
    for(int i=0;i<N;i++){
      if(q.size() == 0){
        break;
      }
      Integer j = q.remove();
      if(j == 1){
        continue;
      }else{
        q.addAll(v.get(j));
      }
      s_score++;
    }
    if(f_socre > s_score){
      System.out.println("Fennec");
    }else{
      System.out.println("Snuke");
    }
  }
}
