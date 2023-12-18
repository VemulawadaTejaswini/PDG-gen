import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] X = new int[N];
            for (int i = 0; i < N; i++) {
                X[i] = in.nextInt();
            }

            Comparator<Pair<Integer, Integer>> comparator = new Comparator<Pair<Integer, Integer>>() {
                @Override
                public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                    if (o1.first.intValue() < o2.first.intValue()) {
                        return -1;
                    }
                    if (o1.first.intValue() > o2.first.intValue()) {
                        return 1;
                    }

                    if (o1.second.intValue() < o2.second.intValue()) {
                        return -1;
                    }
                    if (o1.second.intValue() > o2.second.intValue()) {
                        return 1;
                    }
                    return 0;
                }
            };
            MyTreap<Pair<Integer, Integer>> treap = new MyTreap<>(comparator);
            for (int i = 0; i < N; i++) {
                treap.add(new Pair<Integer, Integer>(X[i], i));
            }

            int[] medians = new int[N];
            for (int i = 0; i < N; i++) {
                Pair<Integer, Integer> pair = treap.remove(i);
                medians[pair.second.intValue()] = treap.get((N - 2) / 2).first.intValue();
                treap.add(pair);
            }

            for (int i = 0; i < N; i++) {
                System.out.println(medians[i]);
            }
        }
    }
}

class MyTreap<T> {
    private class Node<S> {
        private Node<S> l;
        private Node<S> r;
        private int priority;
        private T value;
        private int size;

        public Node(T value) {
            super();
            this.priority = rand.nextInt();
            this.value = value;
            this.size = 1;
        }
    }

    private static final Random rand = new Random(System.nanoTime());
    private Comparator<T> comparator;
    private Node<T> root;

    public MyTreap(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public T get(int index) {
        return get(root, index);
    }

    private T get(Node<T> node, int index) {
        if (node == null) {
            return null;
        }
        int sizeNodeL = sz(node.l);
        if (index == sizeNodeL) {
            return node.value;
        } else if (index < sizeNodeL) {
            return get(node.l, index);
        } else {
            return get(node.r, index - 1 - sizeNodeL);
        }
    }

    public void add(T value) {
        root = add(root, new Node<T>(value));
    }

    private Node<T> add(Node<T> node, Node<T> add) {
        if (node == null) {
            return add;
        }
        int compare = comparator.compare(add.value, node.value);
        if (compare <= 0) {
            node.l = add(node.l, add);
        } else {
            node.r = add(node.r, add);
        }
        node.size++;
        if (compare <= 0) {
            if (node.l.priority < node.priority) {
                node = rotateR(node);
            }
        } else {
            if (node.r.priority < node.priority) {
                node = rotateL(node);
            }
        }
        return node;
    }

    public void remove(T value) {
        root = remove(root, value);
    }

    private Node<T> remove(Node<T> node, T value) {
        if (node == null) {
            return null;
        }
        int compare = comparator.compare(value, node.value);
        if (compare == 0) {
            node = remove(node);
            if (node == null) {
                return node;
            }
        } else if (compare < 0) {
            node.l = remove(node.l, value);
        } else {
            node.r = remove(node.r, value);
        }
        node.size = size(node);
        return node;
    }

    private Node<T> remove(Node<T> node) {
        if (node.l == null && node.r == null) {
            clear(node);
            return null;
        }

        Node<T> rotate;
        if (node.r == null || (node.l != null && node.l.priority <= node.r.priority)) {
            rotate = rotateR(node);
            rotate.r = remove(node);
        } else {
            rotate = rotateL(node);
            rotate.l = remove(node);
        }
        rotate.size--;
        return rotate;
    }

    public T remove(int index) {
        T value = get(index);
        remove(value);
        return value;
    }

    public boolean contains(T value) {
        return contains(root, value);
    }

    private boolean contains(Node<T> node, T value) {
        if (node == null) {
            return false;
        }
        int compare = comparator.compare(value, node.value);
        if (compare == 0) {
            return true;
        } else if (compare < 0) {
            return contains(node.l, value);
        } else {
            return contains(node.r, value);
        }
    }

    private Node<T> rotateR(Node<T> node) {
        Node<T> l = node.l;
        Node<T> lr = l.r;
        node.l = lr;
        l.r = node;
        node.size = size(node);
        l.size = size(l);
        return l;
    }

    private Node<T> rotateL(Node<T> node) {
        Node<T> r = node.r;
        Node<T> rl = r.l;
        node.r = rl;
        r.l = node;
        node.size = size(node);
        r.size = size(r);
        return r;
    }

    private int size(Node<T> node) {
        if (node == null) {
            return 0;
        }
        return 1 + sz(node.l) + sz(node.r);
    }

    public int size() {
        return sz(root);
    }

    private int sz(Node<T> node) {
        return node == null ? 0 : node.size;
    }

    public boolean isEmpty() {
        return size() <= 0;
    }

    private void clear(Node<T> node) {
        node.value = null;
        node.l = null;
        node.r = null;
        node = null;
    }

    public void print() {
        print(root, 0);
        System.err.println();
    }

    private void print(Node<T> node, int depth) {
        if (node == null) {
            return;
        }

        print(node.l, depth + 1);
        for (int i = 0; i < depth; i++) {
            System.err.print(" ");
        }
        System.err.println(node.value + " " + node.size + " " + node.priority);
        print(node.r, depth + 1);
    }
}

class Pair<T extends Comparable<T>, S> implements Comparable<Pair<T, S>> {
    public T first;
    public S second;

    public Pair(T t, S s) {
        this.first = t;
        this.second = s;
    }

    private int hash = 0;

    @Override
    public int hashCode() {
        if (hash == 0) {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((first == null) ? 0 : first.hashCode());
            result = prime * result + ((second == null) ? 0 : second.hashCode());
            hash = result;
        }
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair<T, S> other = (Pair<T, S>) obj;
        if (first == null) {
            if (other.first != null)
                return false;
        } else if (!first.equals(other.first))
            return false;
        if (second == null) {
            if (other.second != null)
                return false;
        } else if (!second.equals(other.second))
            return false;
        return true;
    }

    @Override
    public int compareTo(Pair<T, S> o) {
        return first.compareTo(o.first);
    }
}
