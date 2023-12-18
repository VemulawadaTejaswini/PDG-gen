import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String S = sc.nextLine();
        long count = 0;
        List<Integer> r = new ArrayList<>();
        List<Integer> g = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        char[] cs = S.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            char c = cs[i];
            if (c == 'R') r.add(i);
            else if (c == 'G') g.add(i);
            else b.add(i);
        }

        for (int i = 0; i < r.size(); i++) {
            int cr = r.get(i);
            for (int p = 0; p < g.size(); p++) {
                int cg = g.get(p);
                for (int q = 0; q < b.size(); q++) {
                    int cb = b.get(q);
                    int[] arr = new int[]{cr, cg, cb};
                    Arrays.sort(arr);
                    if(arr[2] - arr[1] != arr[1] - arr[0]){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}