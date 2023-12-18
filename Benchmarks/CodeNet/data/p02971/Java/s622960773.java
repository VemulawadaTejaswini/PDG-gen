import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	List<Integer> list = new LinkedList<>();
    	int max = 0;
    	int order = 0;
    	for (int i = 0; i < N; i++) {
    		int num = sc.nextInt();
    		if (max < num) {
    			max = num;
    			order = i;
    		}
    		list.add(num);
    	}
    	Collections.sort(list);
    	int submax = list.get(list.size() - 2);
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < N; i++) {
    		if (i == order) {
    			sb.append(submax).append("\n");
    		} else {
    			sb.append(max).append("\n");
    		}
    	}
    	System.out.println(sb);
    }
}