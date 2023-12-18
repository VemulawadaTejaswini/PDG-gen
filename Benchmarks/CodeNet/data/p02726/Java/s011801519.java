import java.util.*;


class Pair {
    int v1;
    int v2;

    public Pair(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    @Override
    public boolean equals(Object other) {
        return ((Pair)other).v1 == this.v1 && ((Pair)other).v2 == this.v2;
    }


    @Override
    public int hashCode() {
        return Objects.hash(v1, v2);
    }

    @Override
    public String toString() {
        return String.format("(v1, v2)=(%d, %d)", v1, v2);
    }
}


class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        HashSet<Pair> set = new HashSet<>();
        for (int k = 1; k < N; k++) {
            int ans = 0;
            //System.out.println(String.format("=== k == %d ===", k));
            for (int i = 1; i <= N - k; i++) {
                Pair p = new Pair(i, i + k);
                if (!set.contains(p)) {
                    set.add(p);
                    assert set.contains(p);
                    ans++;
                    //System.out.println(p + ", hashcode:" + p.hashCode());
                } else {
                    //System.out.println(p + " exists.");
                }

                // check overlap
                if (i <= X && i + k > X) {
                    // within N?
                    // check short path is within N?
                    int sd = k - ((X - i) + 1);
                    if (Y + sd <= N)  {
                        Pair p2 = new Pair(i, Y + sd);
                        if (!set.contains(p2)) {
                            set.add(p2);
                            ans++;
                            //System.out.println(p2 + ", hashcode:" + p2.hashCode());
                        } else {
                            //System.out.println(p2 + " exists.");
                        }
                    }

                    if (Y - sd > X && i < Y - sd)  {
                        Pair p3 = new Pair(i, Y - sd);
                        if (!set.contains(p3)) {
                            set.add(p3);
                            ans++;
                            //System.out.println(p3 + ", hashcode:" + p3.hashCode());
                        } else {
                            //System.out.println(p3 + " exists.");
                        }
                    }
                }

                if (i > X && i - X < k) {
                    int sd = k - ((i - X) + 1);
                    if (Y + sd <= N)  {
                        Pair p2 = new Pair(i, Y + sd);
                        if (!set.contains(p2)) {
                            set.add(p2);
                            ans++;
                            //System.out.println(p2 + ", hashcode:" + p2.hashCode());
                        } else {
                            //System.out.println(p2 + " exists.");
                        }
                    }

                    if (Y - sd > X && i < Y - sd)  {
                        Pair p3 = new Pair(i, Y - sd);
                        if (!set.contains(p3)) {
                            set.add(p3);
                            ans++;
                            //System.out.println(p3 + ", hashcode:" + p3.hashCode());
                        } else {
                            //System.out.println(p3 + " exists.");
                        }
                    }
                }


            }

            System.out.println(ans);
        }
    }
}
