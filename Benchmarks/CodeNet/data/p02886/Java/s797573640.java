import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
     
      List<Integer> a = new ArrayList<>();
      
      for(int i=0; i<N; i++){
      a.add(sc.nextInt());
      }
      
      int sum = 0;
      for(int i=0; i<N; i++){
      for(int j=i+1; j<N; j++){
      sum +=a.get(i)*a.get(j);
      }
      }
      System.out.println(sum);
    }
}