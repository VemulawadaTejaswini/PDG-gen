import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<Character, List<Integer>> posMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if(!posMap.containsKey(c))
        		posMap.put(c, new ArrayList<>());
        	posMap.get(c).add(i);
        }

        int min = s.length() / 2;
        for(List<Integer> list : posMap.values()) {
        	if(list.size() == 1) continue;
        	Collections.sort(list);
        	
        	int maxDist = list.get(0);
        	for(int i = 1; i < list.size(); i++) {
        	    int dist = Math.abs(list.get(i) - list.get(i-1) - 1);
        		maxDist = Math.max(maxDist, dist);
        	}
        	maxDist = Math.max(maxDist, Math.abs(s.length() - list.get(list.size() - 1) - 1));

        	min = Math.min(min, maxDist);
        }
        System.out.println(min);
    }
}
