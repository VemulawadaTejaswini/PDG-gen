import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> headTailFreq = new HashMap<>();

        String s = "";
        for(int i = 1; i <= n; i++) {
        	s = String.valueOf(i);
        	int head = s.charAt(0) - '0';
        	int tail = s.charAt(s.length()-1) - '0';
        	if(tail == 0) continue;
        	int key = head * 10 + tail;
        	headTailFreq.put(key, headTailFreq.getOrDefault(key, 0) + 1);
        }
        int cnt = 0;
        for(Map.Entry<Integer, Integer> entry : headTailFreq.entrySet()) {
        	int head = entry.getKey() / 10;
        	int tail = entry.getKey() % 10;
        	cnt += entry.getValue() * headTailFreq.getOrDefault(tail * 10 + head, 0);
        }
        System.out.println(cnt);
    }
}
