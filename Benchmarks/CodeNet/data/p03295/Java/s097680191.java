import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Pair> rl = new ArrayList<Pair>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            rl.add(new Pair(b, a));
        }
        Collections.sort(rl);
        int ans = 0;
        int start = 0;
        for (Pair p : rl) {
            if (p.second >= start) {
                ans++;
                start = p.first;
            }
        }
        System.out.println(ans);
    }
}
class Pair implements Comparable<Pair> {
    int first;
    int second;
    public Pair(int i, int j) {
        this.first = i;
        this.second = j;
    }
    public int compareTo(Pair p) {
        if (this.first < p.first) return -1;
        else if (this.first > p.first) return 1;
        else {
            if (this.second < p.second) return -1;
            else if (this.second > p.second) return 1;
            else return 0;
        }
    }
}