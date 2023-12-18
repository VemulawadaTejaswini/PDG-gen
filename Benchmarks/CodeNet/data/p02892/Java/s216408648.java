import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int i = 0; i < size; i++)
            Node.nodeList.add(new Node(i));
        for (int i = 0; i < size; i++) {
            String s = sc.next();
            for (int k = 0; k < size; k++) {
                if (s.charAt(k) == '1') {
                    Node.nodeList.get(i).addEdge(Node.nodeList.get(k));
                }
            }
        }
        // HashSet<Node> pp = new HashSet<Node>();
        // pp.add(Node.nodeList.get(0));
        // pp.add(Node.nodeList.get(1));
        // System.out.println(pp);
        // ArrayList<HashSet> arset = new ArrayList<HashSet>();
        int ans = 0;
        for (Node node : Node.nodeList) {
            // if(node.isLeaf){
            ArrayList<HashSet<Node>> solver = new ArrayList<HashSet<Node>>();
            ArrayDeque<SimpleEntry<Node, Integer>> queue = new ArrayDeque<SimpleEntry<Node, Integer>>();
            HashSet<Node> qset = new HashSet<Node>();
            queue.add(new SimpleEntry<>(node, 0));
            while (!queue.isEmpty()) {
                SimpleEntry<Node, Integer> se = queue.poll();
                if (qset.contains(se.getKey()))
                    continue;
                qset.add(se.getKey());
                if (!se.getKey().check(solver, queue, se.getValue())) {
                    break;
                }
            }
            if (queue.isEmpty()) {
                int oks = 0;
                for (Node noq : Node.nodeList) {
                    if (noq.isValid(solver))
                        oks++;
                }
                if (oks == Node.nodeList.size())
                    ans = Math.max(solver.size(), ans);
            }
            //System.out.println(Arrays.toString(solver.toArray()));
        }

        System.out.println(ans != 0 ? ans : -1);
    }
}

class Node {
    static ArrayList<Node> nodeList = new ArrayList<Node>();
    final int number;
    // HashSet myset = ;
    boolean isLeaf = true;
    ArrayList<Node> edge = new ArrayList<Node>();

    Node(int number) {
        this.number = number;
    }

    ArrayList<Node> exs = new ArrayList<Node>();

    public boolean check(ArrayList<HashSet<Node>> arset, ArrayDeque<SimpleEntry<Node, Integer>> queue, int set) {
        //System.out.println("call" + number + "  " + set);
        if (set >= arset.size()) {
            arset.add(new HashSet<Node>());
        }
        arset.get(set).add(this);
        // int con = 0;
        // for (int k = 0; k < arset.size(); k++) {
        //     HashSet<Node> hs = arset.get(k);
        //     if (hs.contains(this)) {
        //         con++;
        //         if (con > 1)
        //             return false;
        //         if (k == set)
        //             continue;
        //         return false;
        //     }
        // }
        // exs = new ArrayList<Node>();
        for (int i = 0; i < edge.size(); i++) {
            Node n = edge.get(i);
            // for (int k = 0; k < arset.size(); k++) {
            //     HashSet<Node> hs = arset.get(k);
            //     if (hs.contains(n)) {
            //         if (Math.abs(k - set) == 1)
            //             continue;
            //         return false;
            //     }
            // }
            // if (set >= 1 && arset.get(set - 1).contains(n))
            //     continue;
            queue.add(new SimpleEntry<>(n, set + 1));
        }
        return true;
    }

    public boolean isValid(ArrayList<HashSet<Node>> arset) {
        int con = 0;
        for (int i = 0; i < arset.size(); i++) {
            if (arset.get(i).contains(this)) {
                //System.out.println(arset.get(i));
                con++;
                HashSet<Node> pr = null;
                HashSet<Node> ne = null;
                if (i >= 1)
                    pr = arset.get(i - 1);
                if (i < arset.size() - 1)
                    ne = arset.get(i + 1);
                for (Node node : edge) {
                    int pk = 0;
                    if (pr != null && pr.contains(node)) {
                        pk++;
                    }
                    if (ne != null && ne.contains(node)) {
                        pk++;
                    }
                    if (pk != 1)
                        return false;
                }
            }
        }
        if (con != 1)
            return false;
        return true;
    }

    void addEdge(Node n) {
        edge.add(n);
        if (edge.size() <= 1)
            isLeaf = true;
        else
            isLeaf = false;
    }
}