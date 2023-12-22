import java.util.*;
public class Main {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int k = scan.nextInt();
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for(int i = 0; i < n; i++) {
	    	list.add(scan.nextInt());
	    }
	    int sum = 0;
	    for(int i= 0; i < k; i++) {
	    	Integer min = list.stream().mapToInt(v -> v).min().orElseThrow(NoSuchElementException::new);
	        list.remove(min);
	        sum += min;
	    }
	    System.out.println(sum);
	}
 
}