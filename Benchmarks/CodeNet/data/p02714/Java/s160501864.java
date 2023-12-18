import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char c[] = str.toCharArray();
        
        // char c[] = new char[4000];
        // for (int i = 0; i < 4000; i++) {
        //     if (i % 3 == 0) {
        //         c[i] = 'R';
        //     } else if (i % 3 == 1) {
        //         c[i] = 'G';
        //     } else {
        //         c[i] = 'B';
        //     }
        // }
        
        
        List<Integer>[] list = new List[3];
        for (int i = 0; i < 3; i++) {
            list[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < n; i++) {
            if (c[i] == 'R') {
                list[0].add(i);
            } else if (c[i] == 'G') {
                list[1].add(i);
            } else {
                list[2].add(i);
            }
        }
        long sum = list[0].size() * list[1].size() * list[2].size();
        
        long minus = 0;
        for (int offset = 1; offset < n; offset++) {
            for (int i = 0; i < n; i++) {
                int j = i + offset;
                int k = j + offset;
                if (k >= n) continue;
                if (c[i] != c[j] && c[j] != c[k] && c[k] != c[i]) minus++;
            }
        }
        System.out.println(sum - minus);
    }
}
