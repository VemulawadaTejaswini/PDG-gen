import java.util.*;
 
public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		String[] str = new String[N];
		for(int i = 0;i < N;i++) {
			String x = sc.next();
			str[i] += x; 
		}
		for(int i = 1;i < N;i++) {
			if(str[0].equals(str[i])) {
				
			}else {
				count++;
			}
		}
		System.out.println(count);
	}
}