import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      HashSet<Integer> set = new HashSet<>();
      int count = 0;
      for (int i = 0; i < n; i++){
        int x = sc.nextInt();
        if (set.contains(x)){
          count++;
        } else {
          set.add(x);
          }
        }
      count++;
      count = count / 2 * 2;
        System.out.println(n - count);
	}
}