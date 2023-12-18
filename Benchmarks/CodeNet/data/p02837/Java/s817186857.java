import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Integer, Set<Integer>[]> map = new HashMap<>();
        for(int i = 1; i <= n ; i++) {
        	map.put(i, new HashSet[2]);
        	map.get(i)[0] = new HashSet<>();
        	map.get(i)[1] = new HashSet<>();
        }

        for(int i = 1; i <= n; i++) {
        	int num = sc.nextInt();
        	for(int j = 0; j < num; j++) {
        		int people = sc.nextInt();
        		int flag = sc.nextInt();
        		if(flag == 1) 
        		    map.get(i)[0].add(people);
        		else
        		    map.get(i)[1].add(people);
        	}
        }
        int ans = 0;
        Set<Integer> trueSets = new HashSet<>();
        Set<Integer> falseSets = new HashSet<>();
        
        loop:
        for(int bit = 0; bit < (1 << n); bit++) {
        	trueSets = new HashSet<>();
        	falseSets = new HashSet<>();
        	for(int j = 0; j < n; j++) {
        	    int p = j + 1;
        		if((bit >> j & 1) == 1) {
        			trueSets.addAll(map.get(p)[0]);
        			falseSets.addAll(map.get(p)[1]);
        		}
        	}

        	for(int j = 0; j < n; j++) {
        	    int p = j + 1;
        		if((bit >> j & 1) == 1) {
        			if(falseSets.contains(p))
        				continue loop;
        		} else {
        		    if(trueSets.contains(p))
        				continue loop;
        		}
        	}


        	ans = Math.max(ans, Integer.bitCount(bit));
        }

        System.out.println(ans);
    }
}
