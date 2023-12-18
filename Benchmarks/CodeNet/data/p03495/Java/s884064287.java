import java.util.*;

/**
 * @author varun on 7/1/2018
 * @project CompetitiveProgramming
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int maxNumKeys = scanner.nextInt();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int temp = scanner.nextInt();
            if (frequencyMap.containsKey(temp)) {
                frequencyMap.put(temp, frequencyMap.get(temp) + 1);
            } else {
                frequencyMap.put(temp, 1);
            }
        }
        List<Integer> freq = new ArrayList<>(frequencyMap.values());
        Collections.sort(freq);
        int ans = 0;
        while(freq.size() > maxNumKeys) {
            ans += freq.get(0);
            freq.remove(0);
        }
        System.out.println(ans);
    }
}
