import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
      	int N = input.nextInt();
      	Integer[] ns = new Integer[N];
      	Map<Integer, Integer> map1 = new TreeMap<Integer, Integer>();
      	Map<Integer, Integer> map2 = new TreeMap<Integer, Integer>();
      	int ans = 0;
      	for (int i = 0; i < N; i++) {
          	ns[i] = input.nextInt();
          	int count = 1;
          	if (i % 2 == 0) {
            	if (map1.containsKey(ns[i])) {
                    count = map1.get(ns[i]) + 1;
                }
                map1.put(ns[i], count);
            } else {
            	if (map2.containsKey(ns[i])) {
                    count = map2.get(ns[i]) + 1;
                }
                map2.put(ns[i], count);
            }
          	
        }
      	Integer[] keys1 =  map1.keySet().toArray(new Integer[map1.values().size()]);
      	Integer[] keys2 =  map2.keySet().toArray(new Integer[map2.values().size()]);
      	int first = keys1[0];
      	int second = keys2[0];
      	int j = 1;
      	while (first == second) {
          	if (j <  keys1.length && j < keys2.length) {
            	if (map1.get( keys1[j]) > map2.get( keys2[j])) {
            		first = keys1[j];
                } else {
                	second = keys2[j];
                }
            } else if (j < keys1.length) {
              	second = keys2[j];
            } else if (j < keys2.length) {
              	first = keys1[j];
            } else {
            	second++;
            }
          	j++;
        	
        }
      	
      	for (int i = 0; i < N - 2; i++) {
          	if ((i % 2 == 0 && ns[i] != first) || (i % 2 == 1 && ns[i] != second)) {
            	ans++;
            } else if (ns[i] != ns[i + 2]) {
            	ans++;
            }
          	
        }
        for (int i = N - 2; i < N; i++) {
          	if (ns[i] == ns[i - 2]) {
            	if ((i % 2 == 0 && ns[i] != first) || (i % 2 == 1 && ns[i] != second)) {
                    ans++;
                }
            }
        	
        }
      	
		System.out.print(ans);

    }
  	
}
