import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        RBMap<Integer, Integer> set = new RBMap<>();

        ArrayList<Op> ops = new ArrayList<Op>();
        for(int i=0; i<n; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            int x = sc.nextInt();
            ops.add(new Op(0, x, s-x));
            ops.add(new Op(1, x, t-x));
        }

        Collections.sort(ops);
        int oi = -1;
        int on = ops.size();

        for(int i=0; i<q; i++) {
            int d = sc.nextInt();
            while(oi + 1 < on && ops.get(oi+1).time <= d) {
                oi ++;
                Op op = ops.get(oi);
                if(op.type == 0) {
                    set.insert(op.num, op.num);
                } else {
                    set.delete(op.num);
                }
            }
            if(set.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(set.min());
            }
        }


    }

    static class Op implements Comparable<Op>{
        int type;
        int num;
        int time;
        public Op(int type, int num, int time) {
            this.type = type;
            this.num = num;
            this.time = time;
        }
        @Override public int compareTo(Op o) {
            if(time == o.time) return 0;
            return time < o.time ? -1 : 1;
        }

    }

    static class RBMap<K extends Comparable<? super K>,V> {

        private static enum Color { R, B, Error }

        private class Node {
            Color color;
            K key;
            V value;
            Node lst = null;
            Node rst = null; 

            Node(Color color, K key, V x) {
                this.color = color;
                this.key = key;
                this.value = x;
            }
        }
        private Node root = null;
        private boolean change;
        private K lmax;
        private V value;

        private boolean isR(Node n) { return n != null && n.color == Color.R; }

        private boolean isB(Node n) { return n != null && n.color == Color.B; }

        private Node rotateL(Node v) {
            Node u = v.rst, t2 = u.lst;
            u.lst = v; v.rst = t2;
            return u;
        }

        private Node rotateR(Node u) {
            Node v = u.lst, t2 = v.rst;
            v.rst = u; u.lst = t2;
            return v;
        }

        private Node rotateLR(Node t) {
            t.lst = rotateL(t.lst);
            return rotateR(t);
        }

        private Node rotateRL(Node t) {
            t.rst = rotateR(t.rst);
            return rotateL(t);
        }

        public void insert(K key, V x) {
            root = insert(root, key, x);
            root.color = Color.B;
        }

        private Node insert(Node t, K key, V x) {
            if (t == null) {
                change = true;
                return new Node(Color.R, key, x);
            }
            else if (key.compareTo(t.key) < 0) {
                t.lst = insert(t.lst, key, x);
                return balance(t);
            }
            else if (key.compareTo(t.key) > 0) {
                t.rst = insert(t.rst, key, x);
                return balance(t);
            }
            else {
                change = false;
                t.value = x;
                return t;
            }
        }

        private Node balance(Node t) {
            if (!change) return t;
            else if (!isB(t)) return t;
            else if (isR(t.lst) && isR(t.lst.lst)) {
                t = rotateR(t);
                t.lst.color = Color.B;
            }
            else if (isR(t.lst) && isR(t.lst.rst)) {
                t = rotateLR(t);
                t.lst.color = Color.B;
            }
            else if (isR(t.rst) && isR(t.rst.lst)) {
                t = rotateRL(t);
                t.rst.color = Color.B;
            }
            else if (isR(t.rst) && isR(t.rst.rst)) {
                t = rotateL(t);
                t.rst.color = Color.B;
            }
            else change = false;
            return t;
        }

        public void delete(K key) {
            root = delete(root, key);
            if (root != null) root.color = Color.B;
        }

        private Node delete(Node t, K key) {
            if (t == null) {
                change = false;
                return null;
            }
            else if (key.compareTo(t.key) < 0) {
                t.lst = delete(t.lst, key);
                return balanceL(t);
            }
            else if (key.compareTo(t.key) > 0) {
                t.rst = delete(t.rst, key);
                return balanceR(t);
            }
            else {
                if (t.lst == null) {
                    switch (t.color) {
                        case R: change = false; break;
                        case B: change = true;  break;
                    }
                    return t.rst;
                }
                else {
                    t.lst = deleteMax(t.lst);
                    t.key = lmax;
                    t.value = value;
                    return balanceL(t);
                }
            }
        }

        private Node deleteMax(Node t) {
            if (t.rst != null) {
                t.rst = deleteMax(t.rst);
                return balanceR(t);
            }
            else {
                lmax = t.key;
                value = t.value;
                switch (t.color) {
                    case R: change = false; break;
                    case B: change = true;  break;
                }
                return t.lst;
            }
        }

        private Node balanceL(Node t) {
            if (!change) return t;
            else if (isB(t.rst) && isR(t.rst.lst)) {
                Color rb = t.color;
                t = rotateRL(t);
                t.color = rb;
                t.lst.color = Color.B;
                change = false;
            }
            else if (isB(t.rst) && isR(t.rst.rst)) {
                Color rb = t.color;
                t = rotateL(t);
                t.color = rb;
                t.lst.color = Color.B;
                t.rst.color = Color.B;
                change = false;
            }
            else if (isB(t.rst)) {
                Color rb = t.color;
                t.color = Color.B;
                t.rst.color = Color.R;
                change = (rb == Color.B);
            }
            else if (isR(t.rst)) {
                t = rotateL(t);
                t.color = Color.B;
                t.lst.color = Color.R;
                t.lst = balanceL(t.lst);
                change = false;
            }
            return t;
        }

        private Node balanceR(Node t) {
            if (!change) return t;
            else if (isB(t.lst) && isR(t.lst.rst)) {
                Color rb = t.color;
                t = rotateLR(t);
                t.color = rb;
                t.rst.color = Color.B;
                change = false;
            }
            else if (isB(t.lst) && isR(t.lst.lst)) {
                Color rb = t.color;
                t = rotateR(t);
                t.color = rb;
                t.lst.color = Color.B;
                t.rst.color = Color.B;
                change = false;
            }
            else if (isB(t.lst)) {
                Color rb = t.color;
                t.color = Color.B;
                t.lst.color = Color.R;
                change = (rb == Color.B);
            }
            else if (isR(t.lst)) {
                t = rotateR(t);
                t.color = Color.B;
                t.rst.color = Color.R;
                t.rst = balanceR(t.rst);
                change = false;
            }
            return t;
        }


        public boolean member(K key) {
            Node t = root;
            while (t != null) {
                final int cmp = key.compareTo(t.key);
                if      (cmp < 0) t = t.lst;
                else if (cmp > 0) t = t.rst;
                else return true;
            }
            return false;
        }

        public V lookup(K key) {
            Node t = root;
            while (t != null) {
                final int cmp = key.compareTo(t.key);
                if      (cmp < 0) t = t.lst;
                else if (cmp > 0) t = t.rst;
                else return t.value;
            }
            return null;
        }

        public boolean isEmpty() { return root == null; }

        public void clear() { root = null; }

        public ArrayList<K> keys() {
            ArrayList<K> al = new ArrayList<K>();
            keys(root, al);
            return al;
        }

        public ArrayList<V> values() {
            ArrayList<V> al = new ArrayList<V>();
            values(root, al);
            return al;
        }

        public int size() { return keys().size(); }

        public K min() {
            Node t = root;
            if (t == null) return null;
            while (t.lst != null) t = t.lst;
            return t.key;
        }

        public K max() {
            Node t = root;
            if (t == null) return null;
            while (t.rst != null) t = t.rst;
            return t.key;
        }

        private void keys(Node t, ArrayList<K> al) {
            if (t != null) {
                keys(t.lst, al);
                al.add(t.key);
                keys(t.rst, al);
            }
        }

        private void values(Node t, ArrayList<V> al) {
            if (t != null) {
                values(t.lst, al);
                al.add(t.value);
                values(t.rst, al);
            }
        }


    }

}
