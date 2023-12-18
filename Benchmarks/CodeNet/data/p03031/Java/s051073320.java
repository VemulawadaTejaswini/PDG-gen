import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int[] p = new int[m];
        for(int i = 0; i < m; i++) {
            int k = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j < k; j++) {
                list.add(sc.nextInt());
            }
            map.put(i, list);
        }
        for(int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
        }
        int num = 1 << n;
        int ans = 0;
        // numは電球のon/off
        for(int i = 0; i < num; i++) {
            ans++;
            for(Map.Entry<Integer, ArrayList<Integer>> entry: map.entrySet()) {
                int index = entry.getKey();
                ArrayList<Integer> list = entry.getValue();
                int c = count(list, i);
                if(c % 2 != p[index]) {
                    ans--;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
    // いくつの電球がonかを数える
    private static int count(ArrayList<Integer> list, int num) {
        int count = 0;
        // i番目の電球を調べる
        for(int i: list) {
            i--;
            if((num & (1 << i)) != 0) count++;
        }
        return count;
    }
}