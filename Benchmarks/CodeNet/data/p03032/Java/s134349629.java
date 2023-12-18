import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int r = Math.min(n, k);
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        
        int opCount = 1;
        int max = 0;
        while (opCount <= r) {
            for (int i = 0; i <= opCount; i++) {
                int score = calcScore(values, r, opCount - i, i);
                max = Math.max(max, score);
            }
            opCount++;
        }
        
        System.out.println(max);
    }
    
    public static int calcScore(int[] values, int r, int aCount, int bCount) {
        List<Integer> list = new ArrayList<Integer>(); 
        int score = 0;
        for (int i = 0; i < aCount; i++) {
            list.add(values[i]);
            score += values[i];
        }
        for (int i = values.length - 1; i > values.length - 1 - bCount; i--) {
            list.add(values[i]);
            score += values[i];
        }
        
        Collections.sort(list);
        
        int canRemoveCount = r - aCount - bCount;
        for (int i = 0; i < canRemoveCount && i < list.size(); i++) {
            if (list.get(i) < 0) {
                score -= list.get(i);
            }
        }
        
        return score;
    }
}