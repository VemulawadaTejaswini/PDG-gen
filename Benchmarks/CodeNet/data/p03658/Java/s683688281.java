import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());
    Integer[] val = new Integer[N];
    for(int i = 0; i < N; i++){
      val[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(val, Comparator.reverseOrder());
    
    int sum = 0;
    for(int i = 0; i < K; i++){
      sum += val[i];
    }
    
    System.out.println(sum);
  }
}