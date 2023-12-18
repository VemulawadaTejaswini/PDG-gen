import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        int completed = 0;
        List<Integer> nouse = new LinkedList<>();
        Set<Integer> bigin = new HashSet<>();
        Deque<Integer> bigind = new ArrayDeque<>();
        Set<Integer> end = new HashSet<>();
        Deque<Integer> endd = new ArrayDeque<>();
        for(int i = 0; i < n; i++) {
            nouse.add(i);
            char[] s = br.readLine().toCharArray();
            int len = s.length;
            if(s[0] == 'B') {
                bigin.add(i);
                bigind.add(i);
            }
            if(s[len - 1] == 'A') {
                end.add(i);
                endd.add(i);
            }
            for(int j = 0; j < len - 1; j++) {
                if(s[j] == 'A' && s[j + 1] == 'B') completed++;
            }
        }

        while(!nouse.isEmpty()) {
            int s = nouse.remove(0);
            int t = s;
            while(true) {
                if(bigin.contains(s) && !endd.isEmpty()) {
                    bigind.remove(s);
                    bigin.remove(s);
                    int i = endd.poll();
                    end.remove(i);
                    s = i;
                    completed++;
                    nouse.remove((Integer) i);
                    continue;
                }
                if(end.contains(t) && !bigind.isEmpty()) {
                    endd.remove(t);
                    end.remove(t);
                    int i = bigind.poll();
                    bigin.remove(i);
                    t = i;
                    completed++;
                    nouse.remove((Integer) i);
                    continue;
                }
                break;
            }
        }
        
        System.out.println(completed);
        
        br.close();
    }
}