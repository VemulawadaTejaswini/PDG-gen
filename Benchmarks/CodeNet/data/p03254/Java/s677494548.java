import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int X = sc.nextInt();
    	List<Integer> glad = new ArrayList<>();
    	for (int i = 0; i < N; i++) {
			glad.add(sc.nextInt());
		}
    	Collections.sort(glad);
    	int count = 0;
    	for (Integer i : glad) {
    		if (i <= X) {
    			X -= i;
    			count++;
    		} else {
    			break;
    		}
    	}
    	System.out.println(count);
    }
}