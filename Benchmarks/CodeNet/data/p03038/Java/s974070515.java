import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> cards = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            cards.add(sc.nextInt());
        }
        
        int[][] ab = new int[m][2];
        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            int v = sc.nextInt();
            for (int j = 0; j < k; j++) {
                cards.add(v);
            }
        }
        Collections.sort(cards, Collections.reverseOrder());
        
        long answer = 0;
        for (int i = 0; i < n; i++) {
            answer += (long)cards.get(i);
        }
        System.out.println(answer);
    }
}