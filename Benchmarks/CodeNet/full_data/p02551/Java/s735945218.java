import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int Q=sc.nextInt();

        AVLMap<Integer, Integer> tate = new AVLMap<>();
        AVLMap<Integer, Integer> yoko = new AVLMap<>();

        tate.insert(N,N);
        yoko.insert(N,N);

        long ans = 0;
        int left = N;
        int up = N;

        for(int i = 0 ; i< Q;i++){
            int q = sc.nextInt();
            int x = sc.nextInt();
            if(q == 1){
                int down = tate.lookup_large(x) -1;
                ans += down-1;
                if(x < left){
                    yoko.insert(down, x-1);
                    left = x;
                }
            }else{
                int right = yoko.lookup_large(x) -1;
                ans += right-1;
                if(x < up){
                    yoko.insert(right, x-1);
                    up = x;
                }
            }
        }

        System.out.println((long)(N-2)*((long)(N-2)) - ans);
    }
}

class AVLMap<K extends Comparable<? super K>,V> { // K:キーの型, V:値の型
    ///////////////////////////////////////////////////////////////////////////
    // 共通定義
    ///////////////////////////////////////////////////////////////////////////

    private class Node { // ノードの型
        int height;      // そのノードを根とする部分木の高さ
        K key;           // そのノードのキー
        V value;         // そのノードの値
        Node lst = null; // 左部分木
        Node rst = null; // 右部分木

        Node(int height, K key, V x) {
            this.height = height;
            this.key = key;
            this.value = x;
        }
    }

    private Node root = null; // AVL木の根
    private boolean change;   // 修正が必要かを示すフラグ(true:必要, false:不要)
    private K lmax;           // 左部分木のキーの最大値
    private V value;          // lmax に対応する値

    // 部分木 t の高さを返す
    private int height(Node t) { return t == null ? 0 : t.height; }

    // 左右の部分木の高さの差を返す。左が高いと正、右が高いと負
    private int bias(Node t) { return height(t.lst) - height(t.rst); }

    // 左右の部分木の高さから、その木の高さを計算して修正する
    private void modHeight(Node t) {
        t.height = 1 + Math.max(height(t.lst), height(t.rst));
    }

    // ２分探索木 v の左回転。回転した木を返す
    private Node rotateL(Node v) {
        Node u = v.rst, t2 = u.lst;
        u.lst = v; v.rst = t2;
        modHeight(u.lst);
        modHeight(u);
        return u;
    }

    // ２分探索木 u の右回転。回転した木を返す
    private Node rotateR(Node u) {
        Node v = u.lst, t2 = v.rst;
        v.rst = u; u.lst = t2;
        modHeight(v.rst);
        modHeight(v);
        return v;
    }

    // ２分探索木 t の二重回転(左回転 -> 右回転)。回転した木を返す
    private Node rotateLR(Node t) {
        t.lst = rotateL(t.lst);
        return rotateR(t);
    }

    // ２分探索木 t の二重回転(右回転 -> 左回転)。回転した木を返す
    private Node rotateRL(Node t) {
        t.rst = rotateR(t.rst);
        return rotateL(t);
    }

    ///////////////////////////////////////////////////////////////////////////
    // バランス回復
    ///////////////////////////////////////////////////////////////////////////

    // 挿入時の修正(balanceLi:左部分木への挿入, balanceRi:右部分木への挿入)
    private Node balanceLi(Node t) { return balanceL(t); }
    private Node balanceRi(Node t) { return balanceR(t); }

    // 削除時の修正(balanceLd:左部分木での削除, balanceRd:右部分木での削除)
    private Node balanceLd(Node t) { return balanceR(t); }
    private Node balanceRd(Node t) { return balanceL(t); }

    // 部分木 t のバランスを回復して戻り値で返す
    // 左部分木への挿入に伴うAVL木の修正
    // 右部分木での削除に伴うAVL木の修正
    private Node balanceL(Node t) {
        if (!change) return t;
        int h = height(t);
        if (bias(t) == 2) {
            if (bias(t.lst) >= 0)
                t = rotateR(t);
            else
                t = rotateLR(t);
        }
        else modHeight(t);
        change = (h != height(t));
        return t;
    }

    // 部分木 t のバランスを回復して戻り値で返す
    // 右部分木への挿入に伴うAVL木の修正
    // 左部分木での削除に伴うAVL木の修正
    private Node balanceR(Node t) {
        if (!change) return t;
        int h = height(t);
        if (bias(t) == -2) {
            if (bias(t.rst) <= 0)
                t = rotateL(t);
            else
                t = rotateRL(t);
        }
        else modHeight(t);
        change = (h != height(t));
        return t;
    }

    ///////////////////////////////////////////////////////////////////////////
    // insert(挿入)
    ///////////////////////////////////////////////////////////////////////////

    // エントリー(key, x のペア)を挿入する
    public void insert(K key, V x) { root = insert(root, key, x); }

    private Node insert(Node t, K key, V x) {
        if (t == null) {
            change = true;
            return new Node(1, key, x);
        }
        else if (key.compareTo(t.key) < 0) {
            t.lst = insert(t.lst, key, x);
            return balanceLi(t);
        }
        else if (key.compareTo(t.key) > 0) {
            t.rst = insert(t.rst, key, x);
            return balanceRi(t);
        }
        else {
            change = false;
            t.value = x;
            return t;
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // delete(削除)
    ///////////////////////////////////////////////////////////////////////////

    // key で指すエントリー(ノード)を削除する
    public void delete(K key) { root = delete(root, key); }

    private Node delete(Node t, K key) {
        if (t == null) {
            change = false;
            return null;
        }
        else if (key.compareTo(t.key) < 0) {
            t.lst = delete(t.lst, key);
            return balanceLd(t);
        }
        else if (key.compareTo(t.key) > 0) {
            t.rst = delete(t.rst, key);
            return balanceRd(t);
        }
        else {
            if (t.lst == null) {
                change = true;
                return t.rst; // 右部分木を昇格させる
            }
            else {
                t.lst = deleteMax(t.lst); // 左部分木の最大値を削除する
                t.key = lmax; // 左部分木の削除した最大値で置き換える
                t.value = value;
                return balanceLd(t);
            }
        }
    }

    // 部分木 t の最大値のノードを削除する
    // 戻り値は削除により修正された部分木
    // 削除した最大値を lmax に保存する
    private Node deleteMax(Node t) {
        if (t.rst != null) {
            t.rst = deleteMax(t.rst);
            return balanceRd(t);
        }
        else {
            change = true;
            lmax = t.key; // 部分木のキーの最大値を保存
            value = t.value;
            return t.lst; // 左部分木を昇格させる
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // 検索等
    ///////////////////////////////////////////////////////////////////////////

    // キーの検索。ヒットすれば true、しなければ false
    public boolean member(K key) {
        Node t = root;
        while (t != null) {
            if      (key.compareTo(t.key) < 0) t = t.lst;
            else if (key.compareTo(t.key) > 0) t = t.rst;
            else return true;
        }
        return false;
    }

    // キーから値を得る。キーがヒットしない場合は null を返す
    public V lookup(K key) {
        Node t = root;
        while (t != null) {
            if      (key.compareTo(t.key) < 0) t = t.lst;
            else if (key.compareTo(t.key) > 0) t = t.rst;
            else return t.value;
        }
        return null;
    }

    public V lookup_large(K key) {
        Node t = root;
        Node t_prev = null;
        while (t != null) {
            if      (key.compareTo(t.key) < 0) t = t.lst;
            else if (key.compareTo(t.key) > 0) t = t.rst;
            else return t.value;
        }
        return (t_prev.rst == null ? t_prev : t_prev.rst).value;
    }

    // マップが空なら true、空でないなら false
    public boolean isEmpty() { return root == null; }

    // マップを空にする
    public void clear() { root = null; }

    // キーのリスト
    public ArrayList<K> keys() {
        ArrayList<K> al = new ArrayList<K>();
        keys(root, al);
        return al;
    }

    // 値のリスト
    public ArrayList<V> values() {
        ArrayList<V> al = new ArrayList<V>();
        values(root, al);
        return al;
    }

    // マップのサイズ
    public int size() { return keys().size(); }

    // キーの最小値
    public K min() {
        Node t = root;
        if (t == null) return null;
        while (t.lst != null) t = t.lst;
        return t.key;
    }

    // キーの最大値
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