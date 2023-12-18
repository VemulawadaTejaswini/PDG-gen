import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{
    private static class Testimony {
        int target;
        boolean truth;

        public Testimony(int target, boolean truth)
        {
            this.target = target;
            this.truth = truth;
        }
    }

    private static boolean satisfy(boolean[] members, List<List<Testimony>> testimonies) {
        for (int i = 0; i < testimonies.size(); i++) {
            if (!members[i]) {
                continue;
            }
            List<Testimony> ts = testimonies.get(i);
            for (Testimony t : ts) {
                if (members[t.target] != t.truth) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int max = 0;

    private static void solve(boolean[] members, List<List<Testimony>> testimonies, int n, int cur)
    {
        if (cur >= n) {
            return;
        }

//System.out.println(String.format("members=%s, n=%d, cur=%d", Arrays.toString(members), n, cur));

        int honests = 0;
        for (int i = 0; i < members.length; i++) {
            if (members[i]) {
                honests++;
            }
        }

        if (honests > max && satisfy(members, testimonies)) {
//System.out.println(String.format("members=%s, n=%d, cur=%d: Update max to %d", Arrays.toString(members), n, cur, honests));
            max = honests;
        }

        boolean[] newMembers = Arrays.copyOf(members, members.length);
        newMembers[cur] = false;
        int newHonests = honests - 1;
        if (newHonests > max && satisfy(newMembers, testimonies)) {
//System.out.println(String.format("members=%s, n=%d, cur=%d: Update max to %d", Arrays.toString(members), n, cur, newHonests));
            max = newHonests;
        }

        solve(members, testimonies, n, cur + 1);
        solve(newMembers, testimonies, n, cur + 1);
    }

    public static void main(String[] args)
    {
        /*
        List<List<Testimony>> testimonies = new ArrayList<>(3);
        testimonies.add(new ArrayList<>());
        testimonies.add(new ArrayList<>());
        testimonies.add(new ArrayList<>());
        testimonies.get(0).add(new Testimony(1, true));
        testimonies.get(1).add(new Testimony(0, true));
        testimonies.get(2).add(new Testimony(1, false));
        boolean[] members = new boolean[3];
        Arrays.fill(members, true);
        solve(members, testimonies, 3, 0);
        System.out.println(max);
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Testimony>> testimonies = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int an = sc.nextInt();
            ArrayList<Testimony> ts = new ArrayList<>();
            for (int ai = 0; ai < an; ai++) {
                ts.add(new Testimony(sc.nextInt() - 1, sc.nextInt() == 1));
            }
            testimonies.add(ts);
        }

        boolean[] members = new boolean[n];
        Arrays.fill(members, true);

        solve(members, testimonies, n, 0);

        System.out.println(max);
    }
}
