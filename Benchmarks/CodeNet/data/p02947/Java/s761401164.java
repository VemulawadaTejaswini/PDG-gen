import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<char[]> aList = new ArrayList<>();
		ArrayList<String> sortedList = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		int ans = 0;
		
		for(int i = 0; i < N; i++) {
			aList.add(sc.next().toCharArray());
		}
		
		for(int i = 0; i < N; i++) {
			Arrays.sort(aList.get(i));
			sortedList.add(String.valueOf(aList.get(i)));
		}
		
		for(int i = 0; i < N; i++) {
			String s = sortedList.get(i);
			if(map.containsKey(s)) {
				int num = map.get(s);
				ans += num;
				map.put(s, num+1);
			}else {
				map.put(s, 1);				
			}
		}

		System.out.println(ans);
		sc.close();
	}

}
