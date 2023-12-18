import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
      	int N = input.nextInt();
      	int M = input.nextInt();
      	int Q = input.nextInt();
      	
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
      	
      	for (int i = 0; i < M; i++) {
        	Integer s = input.nextInt();
        	Integer e = input.nextInt();
          	if (map.containsKey(s)) {
            	map.get(s).add(e);
            } else {
            	ArrayList<Integer> list = new ArrayList<Integer>();
              	list.add(e);
              	map.put(s, list);
            }
        }
      	for (int i = 0; i < Q; i++) {
        	int s = input.nextInt();
        	int e = input.nextInt();
          	int ans = 0;
          	for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
              int k = entry.getKey();
              ArrayList<Integer> list = entry.getValue();
              if (k >= s) {
                int count = 0; 		
                while (list.size() > count) {
                  	int ee = list.get(count);
                  	if (ee <= e) {
                      ans++;
                    }
                     count++;
                }
              }
            }
        	System.out.println(ans);
        }
      	
      	
    } 	
}
