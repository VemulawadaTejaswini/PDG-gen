import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      int N = sc.nextInt();
		      long a = 1;
		      if(N != 0 ) {
			      for(int i = 0; i < N; i++) {
			        a *= sc.nextLong();
			      }
			      
			      if(a >= Math.pow(10, 18)){
			        System.out.println("-1");
			      } else {
			    	  System.out.println(a);
			      }
		      } else {
		    	  System.out.println(0);
		      }
		    
	    
		
		  



//		Map<String, Integer> map = new HashMap<>();
//		map.put("a",1);
//		Map<String, Map<String, Integer>> map2 = new HashMap<>();
//		map2.put("s", map);
//		map2.getOrDefault("a", Collections.emptyMap()).remove("a");
//		map2.getOrDefault("s", Collections.emptyMap()).remove("a");
		
	}
}