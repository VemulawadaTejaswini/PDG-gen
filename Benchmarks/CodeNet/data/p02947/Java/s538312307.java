import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] a = new String[N];
		int sum= 0;
		int b=1;
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(int i = 0;i<N;i++) {
			a[i]=sc.next();
	        char []chars =a[i].toCharArray();
	        Arrays.sort(chars);
	        String sorted = new String(chars);

			if(map.containsKey(sorted)) {
				sum+=map.get(sorted);
				b++;
			}
			map.put(sorted,b);
		}
		System.out.print(sum);
		}
}