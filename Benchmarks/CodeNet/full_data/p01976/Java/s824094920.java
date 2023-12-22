import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> frontMod = new HashMap<>();
        HashMap<Integer, Integer> reerMod = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int y = arr[n - i - 1];
            if (x != y) {
                if (reerMod.containsKey(x)) {
                    int z = reerMod.get(x);
                    if (z == 1) {
                        reerMod.remove(x);
                    } else {
                        reerMod.put(x, z - 1);
                    }
                } else if (frontMod.containsKey(x)) {
                    frontMod.put(x, frontMod.get(x) + 1);
                } else {
                    frontMod.put(x, 1);
                }
                if (frontMod.containsKey(y)) {
                    int z = frontMod.get(y);
                    if (z == 1) {
                        frontMod.remove(y);
                    } else {
                        frontMod.put(y, z - 1);
                    }
                } else if (reerMod.containsKey(y)) {
                    reerMod.put(y, reerMod.get(y) + 1);
                } else {
                    reerMod.put(y, 1);
                }
            }
            if (frontMod.size() == 0 && reerMod.size() == 0) {
                ans.add(i + 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ans.size(); i++) {
            if (i != 0) {
                sb.append(" ");
            }
            sb.append(ans.get(i));
        }
        System.out.println(sb);
    }
}

