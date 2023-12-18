import java.util.*;
import java .io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        List<Integer> ht = new ArrayList<>();
        while(n > 0) {
            ht.add(s.nextInt());
            n--;
        }
        Collections.sort(ht);
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        int i = 0;
        int ans = Integer.MAX_VALUE;
        while(i < k) {
            maxQ.add(ht.get(i));
            minQ.add(ht.get(i));
            i++;
        }
        ans = min(ans,maxQ.peek() - minQ.peek());
        while(i < ht.size()) {
            int nextEle = ht.get(i);
            int prevEle = ht.get(i - k);
            maxQ.remove(prevEle);
            minQ.remove(prevEle);
            maxQ.add(nextEle);
            minQ.add(nextEle);
            ans = min(ans,maxQ.peek() - minQ.peek());
            i++;
        }
        System.out.println(ans);
    }
    static int min(int a, int b) {
        return a < b ? a : b;
    }
}
