import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		ArrayList<Integer> inputs = new ArrayList<Integer>();
		for(int n =0; n<a; n++) {
			int ele = scanner.nextInt();
			inputs.add(ele);
		}
		System.out.println(min(a,inputs));
 
	}
	
	public static int min(int in,ArrayList<Integer> inputs) {
		int ans = 0;
		for(Integer ins: inputs) {
			ans += (ins-in)*(ins-in);
		}
		return ans;
	}
	
}