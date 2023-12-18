import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();
        List<Integer> r = new ArrayList<>();
        List<Integer> g = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s.substring(i, i + 1).equals("R")) {
                r.add(0, i);
            } else if (s.substring(i, i + 1).equals("G")) {
                g.add(0, i);
            } else {
                b.add(0, i);
            }
        }
        int ans = 0;
        for (int i : r) {
            for (int j : g) {
                if (i > j)
                    break;
                for (int k : b) {
                    if (j > k)
                        break;
                    if (j - i != k - j) {
                        ans++;
                    }
                }
            }
        }
        for (int i : r) {
            for (int j : b) {
                if (i > j)
                    break;
                for (int k : g) {
                    if (j > k)
                        break;
                    if (j - i != k - j) {
                        ans++;
                    }
                }
            }
        }
        for (int i : g) {
            for (int j : r) {
                if (i > j)
                    break;
                for (int k : b) {
                    if (j > k)
                        break;
                    if (j - i != k - j) {
                        ans++;
                    }
                }
            }
        }
        for (int i : g) {
            for (int j : b) {
                if (i > j)
                    break;
                for (int k : r) {
                    if (j > k)
                        break;
                    if (j - i != k - j) {
                        ans++;
                    }
                }
            }
        }
        for (int i : b) {
            for (int j : r) {
                if (i > j)
                    break;
                for (int k : g) {
                    if (j > k)
                        break;
                    if (j - i != k - j) {
                        ans++;
                    }
                }
            }
        }
        for (int i : b) {
            for (int j : g) {
                if (i > j)
                    break;
                for (int k : r) {
                    if (j > k)
                        break;
                    if (j - i != k - j) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}