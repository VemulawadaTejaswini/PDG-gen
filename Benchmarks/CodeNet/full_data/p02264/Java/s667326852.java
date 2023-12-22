import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Queue<Pair<String, Integer>> queue = new Queue<>();
        
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            queue.enqueue(new Pair<String, Integer>(sc.next(), sc.nextInt()));
        }
        
        long pass = 0;
        
        while (!queue.isEmpty()) {
            Pair<String, Integer> p = queue.dequeue();
            int i = p.getValue() - 100;
            if (i <= 0) {
                pass += (100 + i);
                System.out.println("finish " + p.getKey() + " " + pass);
            } else {
                pass += 100;
                p.setValue(i);
                queue.enqueue(p);
                System.out.println("continue " + p.getKey() + " " + pass);
            }
        }
    }
}

class Stack<T> {
    private List<T> list;
    
    public Stack() {
        list = new ArrayList<>();
    }
    
    public void push(T t) {
        list.add(t);
    }
    
    public T pop() {
        T t = list.get(list.size()-1);
        list.remove(list.size()-1);
        return t;
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
}

class Queue<T> {
    Node<T> head;
    Node<T> tail;
    
    public void enqueue(T t) {
        Node<T> n = new Node<>(t);
        if (head == null) head = n;
        if (tail != null) {
            tail.next = n;
            n.prev = tail;
        }
        tail = n;
    }
    
    public T dequeue() {
        T t = head.elem;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        return t;
    }
    
    public boolean isEmpty() {
        return head == null && tail == null;
    }
}

class Node<T> {
    T elem;
    Node<T> prev;
    Node<T> next;
    public Node(T t) { elem = t; }
}

class Pair<K, V> {
    K k;
    V v;
    public K getKey() { return k; }
    public void setKey(K k) { this.k = k; }
    public V getValue() { return v; }
    public void setValue(V v) { this.v = v; }
    public Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }
}