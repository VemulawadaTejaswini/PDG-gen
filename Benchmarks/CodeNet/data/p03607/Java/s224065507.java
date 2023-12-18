import java.util.ArrayList;
import java.util.List;

public class Main {
	 public static void main(String[] args) {
		    java.util.Scanner scanner = new java.util.Scanner(System.in);
		    int n = scanner.nextInt();
		    List<String> nums = new ArrayList<>();
		    for (int i = 0; i < n; i++) {
		    	String a = scanner.next();
		    	if (nums.contains(a)) {
		    		nums.remove(a);
		    	} else {
		    		nums.add(a);
		    	}
		    }
		    System.out.println(nums.size());
		 }


}
