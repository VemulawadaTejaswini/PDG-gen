import java.io.*;
import java.util.*;

public class Main {
    private boolean eof;
    private BufferedReader br;
    private StringTokenizer st;
    private static PrintWriter out;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    private String nextToken() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                eof = true;
                return "-1";
            }
        }
        return st.nextToken();
    }

    private int nextInt() {
        return Integer.parseInt(nextToken());
    }

    private long nextLong() {
        return Long.parseLong(nextToken());
    }

    private double nextDouble() {
        return Double.parseDouble(nextToken());
    }

    private String nextLine() throws IOException {
        return br.readLine();
    }


    private void run() throws IOException {
        InputStream input = System.in;
        PrintStream output = System.out;
        try {
            File f = new File("a.in");
            if (f.exists() && f.canRead()) {
                input = new FileInputStream(f);
                output = new PrintStream("a.out");
            }
        } catch (Throwable ignored) {
        }
        br = new BufferedReader(new InputStreamReader(input));
        out = new PrintWriter(new PrintWriter(output));
        solve();
        br.close();
        out.close();
    }

    private void solve() {
        String s = nextToken();

        boolean f1 = false;
        boolean f2 = false;
        
        if (s.substring(0, 2).equals("01")) f1 = true;
        if (s.substring(0, 2).equals("02")) f1 = true;
        if (s.substring(0, 2).equals("03")) f1 = true;
        if (s.substring(0, 2).equals("04")) f1 = true;
        if (s.substring(0, 2).equals("05")) f1 = true;
        if (s.substring(0, 2).equals("06")) f1 = true;
        if (s.substring(0, 2).equals("07")) f1 = true;
        if (s.substring(0, 2).equals("08")) f1 = true;
        if (s.substring(0, 2).equals("09")) f1 = true;
        if (s.substring(0, 2).equals("10")) f1 = true;
        if (s.substring(0, 2).equals("11")) f1 = true;
        if (s.substring(0, 2).equals("12")) f1 = true;

        if (s.substring(2, 4).equals("01")) f2 = true;
        if (s.substring(2, 4).equals("02")) f2 = true;
        if (s.substring(2, 4).equals("03")) f2 = true;
        if (s.substring(2, 4).equals("04")) f2 = true;
        if (s.substring(2, 4).equals("05")) f2 = true;
        if (s.substring(2, 4).equals("06")) f2 = true;
        if (s.substring(2, 4).equals("07")) f2 = true;
        if (s.substring(2, 4).equals("08")) f2 = true;
        if (s.substring(2, 4).equals("09")) f2 = true;
        if (s.substring(2, 4).equals("10")) f2 = true;
        if (s.substring(2, 4).equals("11")) f2 = true;
        if (s.substring(2, 4).equals("12")) f2 = true;

        if (f1 && f2) {
            out.println("AMBIGUOUS");
        } else if (f1) {
            out.println("MMYY");
        } else if (f2) {
            out.println("YYMM");
        } else {
            out.println("NA");
        }
    }


    private static Random rnd = new Random();

    //Дерево поиска по ключу, балансится за счет случайных приоритетов
    //Поддерживает сумму(мин,макс) элементов в поддереве и нахождение суммы(мин,макс)на заданном отрезке.
    //
    public static class Node {
        public long key;
        public int prior;
        public long sum;
        public long min;
        public long max;
        public int cnt;
        public int f;
        public Node left, right;

        Node(long key) {
            this.key = key;
            this.prior = rnd.nextInt();
            left = right = null;
            this.sum = key;
            this.min = key;
            this.max = key;
            this.cnt = 1;
            this.f = 1;
        }
    }

    public static long getMin(Node t) {
        return t == null ? Integer.MAX_VALUE : t.min;
    }

    public static long getMax(Node t) {
        return t == null ? Integer.MIN_VALUE : t.max;
    }

    public static long getSum(Node t) {
        return t == null ? 0 : t.sum;
    }

    public static int getCnt(Node t) {
        return t == null ? 0 : t.cnt;
    }

    public static int getF(Node t) {
        return t == null ? 1 : t.f;
    }

    public static void update(Node t) {
        if (t != null) {
            t.sum = t.key + getSum(t.left) + getSum(t.right);
            t.min = Math.min(t.key, getMin(t.left));
            t.max = Math.max(t.key, getMax(t.right));
            t.cnt = 1 + getCnt(t.left) + getCnt(t.right);
        }
    }

    public static void push(Node t) {
        if (t != null && t.f == -1) {
            t.key *= t.f;
            if (t.left != null) t.left.f *= t.f;
            if (t.right != null) t.right.f *= t.f;
            Node c = t.left;
            t.left = t.right;
            t.right = c;
            t.f = 1;
        }
    }

    public static void pushAll(Node t) {
        if (t != null) {
            push(t);
            if (t.left != null) {
                pushAll(t.left);
            }
            if (t.right != null) {
                pushAll(t.right);
            }
        }
    }

    // Все с ключем < key в первое дерево, остальные во второе
    public static Pair<Node, Node> split(Node t, long key) {
        if (t == null) return new Pair<>(null, null);
        push(t);
        if (key > t.key) {
            Pair<Node, Node> p = split(t.right, key);
            t.right = p.first;
            update(t);
            return new Pair<>(t, p.second);
        } else {
            Pair<Node, Node> p = split(t.left, key);
            t.left = p.second;
            update(t);
            return new Pair<>(p.first, t);
        }
    }

    //SPLIT ПО НЕЯВНОМУ КЛЮЧУ
    //add for root = 0
    public static Pair<Node, Node> split(Node t, long key, int add) {
        if (t == null) return new Pair<>(null, null);
        int curKey = add + getCnt(t.left);
        if (key > curKey) { //идем в правое поддерево
            Pair<Node, Node> p = split(t.right, key, curKey + 1);
            t.right = p.first;
            update(t);
            return new Pair<>(t, p.second);
        } else { //идем в левое поддерево
            Pair<Node, Node> p = split(t.left, key, add);
            t.left = p.second;
            update(t);
            return new Pair<>(p.first, t);
        }
    }

    //Все ключи в первом дереве должны быть меньше ключей во втором
    public static Node merge(Node t1, Node t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        push(t1);
        push(t2);
        if (t1.prior > t2.prior) {
            t1.right = merge(t1.right, t2);
            update(t1);
            return t1;
        } else {
            t2.left = merge(t1, t2.left);
            update(t2);
            return t2;
        }
    }

//    public static Node insert(Node t, Node newNode) {
//        if (t == null) {
//            t = newNode;
//        } else if (newNode.prior > t.prior) {
//            Pair<Node, Node> p = split(t, newNode.key);
//            newNode.left = p.first;
//            newNode.right = p.second;
//            t = newNode;
//        } else {
//            if (newNode.key < t.key) {
//                t.left = insert(t.left, newNode);
//            } else {
//                t.right = insert(t.right, newNode);
//            }
//        }
//        update(t);
//        return t;
//    }

    //Еще один insert, но вроде не такой быстрый
    public static Node insert(Node t, Node newNode) {
        if (t == null) {
            t = newNode;
        } else {
            Pair<Node, Node> p = split(t, newNode.key);
            t = merge(p.first, newNode);
            t = merge(t, p.second);
        }
        update(t);
        return t;
    }

    //Объединяет 2 разных дерева
    public static Node unite(Node t1, Node t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        push(t1);
        push(t2);
        if (t1.prior < t2.prior) {
            Node c = t1;
            t1 = t2;
            t2 = c;
        }
        Pair<Node, Node> split1 = split(t2, t1.key);
        t1.left = unite(t1.left, split1.first);
        t1.right = unite(t1.right, split1.second);
        return t1;
    }

    public static Node remove(Node t, long key) {
        if (t == null) return null;
        if (t.key == key) {
            t = merge(t.left, t.right);
        } else {
            if (key < t.key) {
                t.left = remove(t.left, key);
            } else {
                t.right = remove(t.right, key);
            }
        }
        update(t);
        return t;
    }

    public static Node find(Node t, long key) {
        if (t == null) return null;
        if (t.key == key) return t;
        if (t.key < key) {
            return find(t.right, key);
        } else {
            return find(t.left, key);
        }
    }

    /**
     * Вырезает отрезок от i до j и вставляет в позицию k нового массива
     * (при k = 0 вставляет вначало)
     *
     * @param t Корень дерева
     * @param i Начало отрезка (включительно)
     * @param j Конец отрезка (включительно)
     * @param k Позиция вставки
     * @return Новое дерево
     */
    public static Node replaceSegment(Node t, int i, int j, int k) {
        //Вырезаем отрезок и склеиваем
        Pair<Node, Node> split1 = split(t, i, 0);
        Pair<Node, Node> split2 = split(split1.second, j - i + 1, 0);
        Node merge1 = merge(split1.first, split2.second);
        Node removedSegment = split2.first;

//      out.println("Array without removed:" + getString(merge1));
//      out.println("Removed Segment:" + getString(removedSegment));

        //разделяем и вставляем
        Pair<Node, Node> split3 = split(merge1, k, 0);
        Node merge2 = merge(split3.first, removedSegment);
        Node merge3 = merge(merge2, split3.second);

        return merge3;
    }

    public static long getSum(Node t, long l, long r) {
        Pair<Node, Node> p1 = split(t, l);
        Pair<Node, Node> p2 = split(p1.second, r + 1);
        long ans = p2.first == null ? 0 : p2.first.sum;
        t = merge(p1.first, p2.first);
        t = merge(t, p2.second);
        return ans;
    }

    public static Node apply(Node t, char c, int v) {
        if (t == null) return t;
        Node res;
        if (c == '<') {
            Pair<Node, Node> split1 = split(t, v);
//            out.println(getKeysString(split1.first));
//            out.println(getKeysString(split1.second));
            if (split1.first != null) split1.first.f *= -1;
            res = unite(split1.first, split1.second);
        } else {
            v++;
            Pair<Node, Node> split1 = split(t, v);
//            out.println(getKeysString(split1.first));
//            out.println(getKeysString(split1.second));
            if (split1.second != null) split1.second.f *= -1;
            res = unite(split1.first, split1.second);
        }
        return res;
    }

    public static StringBuilder getKeysString(Node t) {
        if (t == null) return new StringBuilder();
        StringBuilder ans = new StringBuilder();
        if (t.left != null) ans.append(getKeysString(t.left));
        ans.append(t.key);
        ans.append(" ");
        if (t.right != null) ans.append(getKeysString(t.right));
        return ans;
    }

    public static class Pair<F, S> {
        public F first;
        public S second;

        Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }

//        @Override
//        public int compareTo(Object o) {
//            return first.compareTo(((Pair)o).first);
//        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Main.Pair)) {
                return false;
            }
            Main.Pair<?, ?> p = (Main.Pair<?, ?>) o;
            return Objects.equals(p.first, first) && Objects.equals(p.second, second);
        }

        @Override
        public int hashCode() {
            return (first == null ? 0 : first.hashCode()) ^ (second == null ? 0 : second.hashCode());
        }
    }
}
