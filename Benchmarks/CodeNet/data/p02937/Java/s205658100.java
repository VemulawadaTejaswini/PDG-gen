import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        long ans = -1;
        int[] salp = new int[27];
        int[] talp = new int[27];
        char[] sr = s.toCharArray();
        char[] tr = t.toCharArray();
        HashMap<Character, ArrayList<Integer>> map = new HashMap<Character, ArrayList<Integer>>();

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

        for (int i = 0; i < 27; i++) {
            if (talp[i] > 0) {
                map.put((char)('a' + i), new ArrayList<Integer>());
            }
        }

        int pos = 0;
        // char[] fr = new char[100001];
        // int[] frp = new int[100001];
        for (int i = 0; i < sr.length; i++) {
            if (talp[sr[i] - 'a'] > 0) {
                map.get(sr[i]).add(i);
            }
        }
        pos = 0;
        long rep = 0;

        for (int i = 0; i < tr.length; i++) {
            ArrayList<Integer> list = map.get(tr[i]);
            // System.out.println(Arrays.toString(list.toArray()));
            int ret = binary_search(pos, list);
            int pps = list.get(Math.min(ret,list.size()-1));
            if(pps<pos){
                rep++;
            }
            pos = pps;
            // System.out.println(pos);
        }
        System.out.println(rep * sr.length + pos+1);
        // for (rep = 0; true; rep++) {
        //     for (int i = 0; i < flength; i++) {
        //         if (fr[i] == tr[pos]) {
        //             pos++;
        //             if (pos == tr.length) {
        //                 System.out.println(rep * sr.length + frp[i] + 1);
        //                 return;
        //             }
        //         }
        //     }
        // }
    }

    // index が条件を満たすかどうか
    static boolean isOK(int index, int key, ArrayList<Integer> list) {
        if (list.get(index) >= key)
            return true;
        else
            return false;
    }

    // 汎用的な二分探索のテンプレ
    static int binary_search(int key, ArrayList<Integer> list) {
        for(int i=0;i<list.size();i++){
            if(key<=list.get(i)){
                return i;
            }
        }
        return 0;
    }
}