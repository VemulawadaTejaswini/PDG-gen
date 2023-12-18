import java.util.*;

public class Main {
  	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] n = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
    	Arrays.sort(n);
      	System.out.println(Arrays.equals(n, new int[] {1, 4, 7, 9}));
    }
}