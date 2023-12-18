
import java.util.*;


public class Main {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] st = new String[n];
        for(int i = 0; i < n; i++) {
            st[i] = sc.next();
        }

        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            Map<Character, Integer> curCountMap = new HashMap<>();

            char[] item = st[i].toCharArray();
            for (char ch : item) {
                curCountMap.put(ch, curCountMap.getOrDefault(ch, 0) + 1);
            }

            if (countMap.size() == 0) {
                countMap = new HashMap<>(curCountMap);
            } else {
                List<Character> removeCh = new ArrayList<>();
                for (char ch : countMap.keySet()) {
                    if (curCountMap.containsKey(ch)) {
                        int newN = curCountMap.get(ch);
                        int oldN = countMap.get(ch);

                        countMap.put(ch, Math.min(newN, oldN));
                    } else {
                        removeCh.add(ch);
                    }
                }
                for(char ch: removeCh) {
                    countMap.remove(ch);
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        for(char ch: countMap.keySet()) {
            int count = countMap.get(ch);
            for(int i = 0 ; i < count; i++) {
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
    }
}