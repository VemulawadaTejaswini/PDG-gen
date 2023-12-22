import java.util.Scanner;
import java.util.Iterator;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder output = new StringBuilder();
    DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
    
    int N = in.nextInt();
    while (N != 0) {
      String str = in.next();
      if (str.equals("insert")) {
        int x = in.nextInt();
        list.insert(x);
      }
      else if (str.equals("delete")) {
        int x = in.nextInt();
        list.delete(x);
      }
      else if (str.equals("deleteFirst")) {
        list.deleteFirst();
      }
      else if (str.equals("deleteLast")) {
        list.deleteLast();
      }
      else {
        System.out.println("Keyword error");
      }
      N--; 
    }
    
    for (Integer num: list) {
      output.append(num).append(" ");
    }
    output.deleteCharAt(output.toString().length() - 1);
    System.out.println(output.toString());
  }
}

class DoublyLinkedList<Key> implements Iterable<Key> {
  private int size = 0;
  private Node pre;
  private Node post;
  
  public DoublyLinkedList() {
    pre = new Node();
    post = new Node();
    pre.next = post;
    post.prev = pre;
  }
  
  private class Node {
    Key key;
    Node next;
    Node prev;
  }
  
  public boolean isEmpty() { return size == 0; }
  public int size() { return size; }
  
  public void insert(Key key) {
    Node first = pre.next;
    Node x = new Node();
    x.key = key;
    x.next = first;
    x.prev = pre;
    pre.next = x;
    first.prev = x;
    size++;
  }
  
  public void delete(Key key) {
    Node current = pre;
    do { current = current.next; } 
    while (current.key != key); 
    Node x = current.prev;
    Node y = current.next;
    x.next = y;
    y.prev = x;
    current = null;
    size--;
  }
  
  public void deleteFirst() {
    Node oldfirst = pre.next;
    Node first = oldfirst.next;
    pre.next = first;
    first.prev = pre;
    oldfirst = null;
    size--;
  }
  
  public void deleteLast() {
    Node oldlast = post.prev;
    Node last = oldlast.prev;
    last.next = post;
    post.prev = last;
    oldlast = null;
    size--;
  }
  
  public Iterator<Key> iterator() { return new DoublyLinkedListIterator(); }
  
  private class DoublyLinkedListIterator implements Iterator<Key> {
    private Node current      = pre.next;
    private Node lastAccessed = null;
    private int index = 0;
    
    public boolean hasNext() { return index < size; }
    public Key next() {
      lastAccessed = current;
      Key key = current.key;
      current = current.next; 
      index++;
      return key;
    }
    public void remove() { /* no support */ }
    
  }
}