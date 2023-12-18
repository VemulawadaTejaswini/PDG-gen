import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Map<Integer,Integer> list = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			list.put(sc.nextInt(), i);
		}
		Object[] mapkey = list.keySet().toArray();
		Arrays.sort(mapkey);
		
		for (Integer nKey : list.keySet())
        {
            System.out.print(list.get(nKey)+" ");
        }
	}
}