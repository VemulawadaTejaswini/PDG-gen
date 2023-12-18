import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;
    static ArrayList<Node> nodeList = new ArrayList<Node>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        long ans = -1;
        int[] salp = new int[27];
        int[] talp = new int[27];
        char[] sr = s.toCharArray();
        char[] tr = t.toCharArray();

        for (int i = 0; i < sr.length; i++) {
            salp[sr[i] - 'a']++;
        }
        for (int i = 0; i < tr.length; i++) {
            talp[tr[i] - 'a']++;
            if (salp[tr[i] - 'a'] == 0) {
                System.out.println(ans);
                return;
            }
        }

        int pos = 0;
        char[] fr = new char[100001];
        int[] frp = new int[100001];
        for (int i = 0; i < sr.length; i++) {
            if (talp[sr[i] - 'a'] > 0) {
                fr[pos] = sr[i];
                frp[pos] = i;
                pos++;
            }
        }
        int flength = pos;
        pos = 0;
        long rep;
        for (rep = 0; true; rep++) {
            for (int i = 0; i < flength; i++) {
                if (fr[i] == tr[pos]) {
                    pos++;
                    if (pos == tr.length) {
                        System.out.println(rep * sr.length + frp[i]+1);
                        return;
                    }
                }
            }
        }
    }
}