import java.util.*;

class Main {

    public static boolean bsearch(ArrayList<Integer> a, int left, int right, int goal) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) < goal) {
                left = mid + 1;
            } else if (a.get(mid) > goal) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(in.nextInt());
        }
        Collections.sort(s);
        n = in.nextInt();
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (bsearch(s, 0, s.size() - 1, in.nextInt())) {
                res += 1;
            }
        }
        System.out.println(res);
    }
}