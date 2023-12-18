import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int K = sc.nextInt();
    	StringBuilder sb = new StringBuilder();
    	Set<Integer> set = new HashSet<>();
    	for (int i = A; i < K+A; i++) {
    		set.add(i);
    	}
    	for (int i = B; B-K < i; i--) {
    		set.add(i);
    	}
    	List<Integer> list = new ArrayList<>(set);
    	Collections.sort(list);
    	for (Integer i : list) {
    		sb.append(i + "\n");
    	}
    	System.out.println(sb);
    }
}