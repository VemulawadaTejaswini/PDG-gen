import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int K = sc.nextInt();
      
      List<Integer> a = new ArrayList<>();
      
      for(int i=0; i<N; i++){
      a.add(sc.nextInt());
      }
      Collections.sort(a);
      int sum =0;
      for(int i=0; i<K; i++){
      sum += a.get(i);
      }
      System.out.println(sum);
    }
}