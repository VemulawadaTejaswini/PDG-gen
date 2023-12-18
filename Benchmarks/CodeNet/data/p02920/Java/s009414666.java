import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		Integer[] s = new Integer[1 << n];
		for(int i = 0; i < 1 << n; i++){
		    s[i] = sc.nextInt();
		}
		
		// 計算
		String result = "Yes";
        ArrayList<Integer> visited = new ArrayList<Integer>();
		Arrays.sort(s, Comparator.reverseOrder());
		visited.add(s[0]);
		s[0] = -1;
		for(int i = 0; i < n; i++){
	        int visitedSize = visited.size();
	        int cnt = 0;
	        Arrays.sort(s, Comparator.reverseOrder());
	        Collections.sort(visited, Comparator.reverseOrder());
	        for(int k = 0; k < s.length; k++){
	            if(s[k] == -1){
	                result = "No";
	                break;
	            }
	            if(visited.get(cnt) > s[k]){
	                visited.add(s[k]);
	                s[k] = -1;
	                cnt++;
	                if(cnt == visitedSize) break;
	            }
	        }
		}
		
		// 出力
		System.out.println(result);
	}
}
