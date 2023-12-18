import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }
        Arrays.sort(cards);
        
        List<Integer> kariList = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            int v = sc.nextInt();
            for (int j = 0; j < k; j++) {
                kariList.add(v);
            }
        }
        Collections.sort(kariList, Collections.reverseOrder());
        
        for (int i = 0; i < kariList.size(); i++) {
            if (cards[i] < kariList.get(i)) {
                cards[i] = kariList.get(i);
            } else {
                break;
            }
        }
        
        long answer = 0;
        for (int val : cards) {
            answer += (long)val;
        }
        
        System.out.println(answer);
    }
}