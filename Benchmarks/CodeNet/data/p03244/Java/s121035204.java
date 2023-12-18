import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> m1 = new HashMap<>();
        HashMap<Integer, Integer> m2 = new HashMap<>();
        ArrayList<Integer> v1 = new ArrayList<>();
        ArrayList<Integer> v2 = new ArrayList<>();

        for (int i = 0; i < n; i += 2) {
            if (m1.containsKey(v[i])) {
                m1.put(v[i], m1.get(v[i]) + 1);
            } else {
                m1.put(v[i], 1);
                v1.add(v[i]);
            }

            if (m2.containsKey(v[i + 1])) {
                m2.put(v[i + 1], m2.get(v[i + 1]) + 1);
            } else {
                m2.put(v[i + 1], 1);
                v2.add(v[i + 1]);
            }
        }
        int Amax1 = 0;
        int Amax2 = 0;
        int Bmax1 = 0;
        int Bmax2 = 0;
        int Av1 = 0;
        int Av2 = 0;
        int Bv1 = 0;
        int Bv2 = 0;

        for (int i = 0; i < v1.size(); i++) {
            int tmp = m1.get(v1.get(i));
            if (tmp >= Amax1) {
                Amax2 = Amax1;
                Amax1 = tmp;
                Av2 = Av1;
                Av1 = v1.get(i);
            } else if (tmp >= Amax2) {
                Amax2 = tmp;
                Av2 = v1.get(i);
            }
        }
        for (int i = 0; i < v2.size(); i++) {
            int tmp = m2.get(v2.get(i));
            if (tmp >= Bmax1) {
                Bmax2 = Bmax1;
                Bmax1 = tmp;
                Bv2 = Bv1;
                Bv1 = v2.get(i);
            } else if (tmp >= Bmax2) {
                Bmax2 = tmp;
                Bv2 = v2.get(i);
            }
        }
        int ans = 0;
        if (Av1 == Bv1) {
            if (Amax1 + Bmax2 > Amax2 + Bmax1) {
                ans = n - Amax1 - Bmax2;
            } else {
                ans = n - Amax2 - Bmax1;
            }
        } else {
            ans = n - Amax1 - Bmax1;
        }

        System.out.println(ans);

    }

}
