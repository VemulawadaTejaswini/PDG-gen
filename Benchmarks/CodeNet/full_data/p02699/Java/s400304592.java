import java.util.*;
import java.util.Arrays;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		String[] str = new String[N];
		for (int i = 0; i < N; i++) {
			String x = sc.next();
			if(x.equals('a'- 'z')){
				str[i] += x;
		}
			
		}
		Arrays.sort(str);
		for (int j = 0; j < N; j++) {
			if (str[0].equals(str[j]) == false) {
				count++;
			}
		}
		System.out.println(count);
  }
}