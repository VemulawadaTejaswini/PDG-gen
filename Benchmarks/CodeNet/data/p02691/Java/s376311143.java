import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = Integer.parseInt(sc.next());
    Integer[] A = new Integer[N];
    long number = 0l;
    Map<Integer, Long> map = new HashMap<>();
      for(int i = 0 ; i < N ; i++){
        A[i] = Integer.parseInt(sc.next());
        map.put(i + A[i] , map.getOrDefault(i + A[i] , 0L) + 1L);
      }
        for(int j = 0 ; j < N ; j++){
          number += map.getOrDefault(j - A[j] , 0L);
      }
      
	
	System.out.println(number);
	}
}