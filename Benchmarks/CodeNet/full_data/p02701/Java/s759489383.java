import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
			
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String S = sc.next();
			if(!map.containsKey(S)){
				map.put(S, 1);
			}
		}
		System.out.println(map.size());
		
		
      	sc.close();
    }
		
		
}
