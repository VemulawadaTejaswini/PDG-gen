import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

class FastScanner {
  private final InputStream in = System.in;
  private final byte[] buffer = new byte[1024];
  private int ptr = 0;
  private int buflen = 0;
  private boolean hasNextByte() {
      if (ptr < buflen) {
          return true;
      }else{
          ptr = 0;
          try {
              buflen = in.read(buffer);
          } catch (IOException e) {
              e.printStackTrace();
          }
          if (buflen <= 0) {
              return false;
          }
      }
      return true;
  }
  private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
  private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
  public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
  public String next() {
      if (!hasNext()) throw new NoSuchElementException();
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while(isPrintableChar(b)) {
          sb.appendCodePoint(b);
          b = readByte();
      }
      return sb.toString();
  }
  public long nextLong() {
      if (!hasNext()) throw new NoSuchElementException();
      long n = 0;
      boolean minus = false;
      int b = readByte();
      if (b == '-') {
          minus = true;
          b = readByte();
      }
      if (b < '0' || '9' < b) {
          throw new NumberFormatException();
      }
      while(true){
          if ('0' <= b && b <= '9') {
              n *= 10;
              n += b - '0';
          }else if(b == -1 || !isPrintableChar(b)){
              return minus ? -n : n;
          }else{
              throw new NumberFormatException();
          }
          b = readByte();
      }
  }
  public int nextInt() {
      long nl = nextLong();
      if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
      return (int) nl;
  }
  public double nextDouble() { return Double.parseDouble(next());}
}

public class Main {

  class Node {
    Integer key;
    Node prev;
    Node next;

    public Node(Integer key) {
      this.key = key;
      this.prev = null;
      this.next = null;
    }
  }

  class MyDoublyLinkedList {
    private Node head;

    public MyDoublyLinkedList() {
      head = new Node(null);
      head.prev = head;
      head.next = head;
    }

    public void insert(int key) {
      Node node = new Node(key);
      node.next = head.next;
      head.next.prev = node;
      head.next = node;
      node.prev = head;
    }

    public void delete(int key) {
      deleteNode(listSearch(key));
    }

    public void deleteFirst() {
      deleteNode(head.next);
    }

    public void deleteLast() {
      deleteNode(head.prev);
    }

    private void deleteNode(Node node) {
      if (node == head) return;
      node.prev.next = node.next;
      node.next.prev = node.prev;
    }

    private Node listSearch(int key) {
      Node node = head.next;
      while (node != head && node.key != key) {
        node = node.next;
      }
      return node;
    }

    public void print() {
      Node node = head.next;
      while (node != head) {
        System.out.print(node.key + (node.next != head ? " " : ""));
        node = node.next;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner();

    int n = sc.nextInt();

    MyDoublyLinkedList arr = new Main().new MyDoublyLinkedList();

    for (int i = 0; i < n; i++) {
      String command = sc.next();
      switch (command) {
        case "insert":
        arr.insert(sc.nextInt());
        break;
        case "delete":
        arr.delete(sc.nextInt());
        break;
        case "deleteFirst":
        arr.deleteFirst();
        break;
        case "deleteLast":
        arr.deleteLast();
        break;
      }
    }

    arr.print();
  }
}
