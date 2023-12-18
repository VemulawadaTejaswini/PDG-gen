import java.util.*;


public class Main{

  public static void main(String... args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Integer> lst = new ArrayList<>();
    for(int i=0; i < 3 * N; i++){
      lst.add(sc.nextInt());
    }
    int max = Integer.MIN_VALUE;
    for(int k = 0; k <= N; k++){
      List<Integer> cp = new ArrayList<>(lst);
      List<Integer> b = cp.subList(0, N+k);
      List<Integer> e = cp.subList(N+k, 3*N);
      Collections.sort(b);
      Collections.sort(e);
      int bSum = b.subList(k, k+N).stream().mapToInt(i -> i).sum();
      int eSum = e.subList(0, N).stream().mapToInt(i -> i).sum();
      if(max < bSum - eSum){
        max = bSum - eSum;
      }
    }
    System.out.println(max);
  }
}
