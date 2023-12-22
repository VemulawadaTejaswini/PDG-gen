import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;


class Node {
  public Node next;
  public Node prev;
  public int value;

  public Node(int value) {
    this.value = value;
  }
}

class LinkedList {
  private Node head;
  private Node tail;
  // sentinel
  private final Node NIL;

  public LinkedList() {
    NIL = new Node(Integer.MAX_VALUE);
    NIL.next = NIL;
    NIL.prev = NIL;
    head = NIL;
    tail = NIL;
  }

  public void insert(int x) {
    Node n = new Node(x);
    n.next = head;
    n.prev = head.prev;
    head.prev = n;

    if (head == NIL) {
      tail = n;
      NIL.prev = tail;
    }

    // update head
    head = n;
    NIL.next = head;
  }

  public boolean delete(int x) {
    Node cursor = head;
    while (cursor != NIL) {
      if (cursor.value == x) {
        if (cursor == head) {
          return deleteFirst();
        }
        if (cursor == tail) {
          return deleteLast();
        }
        cursor.prev.next = cursor.next;
        cursor.next.prev = cursor.prev;
        return true;
      }
      cursor = cursor.next;
    }
    return false;
  }

  public boolean deleteFirst() {
    if (head == NIL) {
      return false;
    }
    if (head == tail) {
      tail = NIL;
      tail.prev = NIL;
      tail.next = NIL;
    }

    head = head.next;
    head.prev = NIL;
    return true;
  }

  public boolean deleteLast() {
    if (tail == NIL) {
      return false;
    }

    if (head == tail) {
      head = NIL;
      head.prev = NIL;
      head.next = NIL;
    }

    tail.prev.next = NIL;
    tail = tail.prev;

    return true;
  }

  public void print() {
    StringBuilder buf = new StringBuilder();
    Node cursor = head;
    while (cursor != NIL) {
      buf.append(cursor.value);
      buf.append(" ");
      cursor = cursor.next;
    }
    System.out.println(buf.toString().trim());
  }
}


public class Main {
  private static int N;
  private static ArrayList<Cmd> cmds;
  private static LinkedList head;

  private static void run() {
    head = new LinkedList();
    for (Cmd cmd: cmds) {
      switch(cmd.getCmdOp()) {
      case INSERT:
        head.insert(cmd.getTarget());
        break;
      case DELETE:
        head.delete(cmd.getTarget());
        break;
      case DELETE_FIRST:
        head.deleteFirst();
        break;
      case DELETE_LAST:
        head.deleteLast();
        break;
      default:
        System.out.println("error");
        break;
      }
    }
    head.print();
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    N = in.nextInt();

    cmds = new ArrayList<Cmd>(N);
    for (int i = 0; i < N; i++) {
      String cmdstr = in.next();
      if (cmdstr.equals("deleteFirst") || cmdstr.equals("deleteLast")) {
        cmds.add(new Cmd(cmdstr, 0));
      } else {
        cmds.add(new Cmd(cmdstr, in.nextInt()));
      }
    }

    //for (Cmd cmd: cmds) {
    //  System.out.println(cmd);
    //}

    // init
    run();
  }
}
ozawa@ozamac-2:~/workspace/algo$ javac Main.java 
Picked up _JAVA_OPTIONS: -Dfile.encoding=UTF-8
ozawa@ozamac-2:~/workspace/algo$ cat Main.java 
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;


class Node {
  public Node next;
  public Node prev;
  public int value;

  public Node(int value) {
    this.value = value;
  }
}

class LinkedList {
  private Node head;
  private Node tail;
  // sentinel
  private final Node NIL;

  public LinkedList() {
    NIL = new Node(Integer.MAX_VALUE);
    NIL.next = NIL;
    NIL.prev = NIL;
    head = NIL;
    tail = NIL;
  }

  public void insert(int x) {
    Node n = new Node(x);
    n.next = head;
    n.prev = head.prev;
    head.prev = n;

    if (head == NIL) {
      tail = n;
      NIL.prev = tail;
    }

    // update head
    head = n;
    NIL.next = head;
  }

  public boolean delete(int x) {
    Node cursor = head;
    while (cursor != NIL) {
      if (cursor.value == x) {
        if (cursor == head) {
          return deleteFirst();
        }
        if (cursor == tail) {
          return deleteLast();
        }
        cursor.prev.next = cursor.next;
        cursor.next.prev = cursor.prev;
        return true;
      }
      cursor = cursor.next;
    }
    return false;
  }

  public boolean deleteFirst() {
    if (head == NIL) {
      return false;
    }
    if (head == tail) {
      tail = NIL;
      tail.prev = NIL;
      tail.next = NIL;
    }

    head = head.next;
    head.prev = NIL;
    return true;
  }

  public boolean deleteLast() {
    if (tail == NIL) {
      return false;
    }

    if (head == tail) {
      head = NIL;
      head.prev = NIL;
      head.next = NIL;
    }

    tail.prev.next = NIL;
    tail = tail.prev;

    return true;
  }

  public void print() {
    StringBuilder buf = new StringBuilder();
    Node cursor = head;
    while (cursor != NIL) {
      buf.append(cursor.value);
      buf.append(" ");
      cursor = cursor.next;
    }
    System.out.println(buf.toString().trim());
  }
}


public class Main {
  private static int N;
  private static ArrayList<Cmd> cmds;
  private static LinkedList head;

  private static void run() {
    head = new LinkedList();
    for (Cmd cmd: cmds) {
      switch(cmd.getCmdOp()) {
      case INSERT:
        head.insert(cmd.getTarget());
        break;
      case DELETE:
        head.delete(cmd.getTarget());
        break;
      case DELETE_FIRST:
        head.deleteFirst();
        break;
      case DELETE_LAST:
        head.deleteLast();
        break;
      default:
        System.out.println("error");
        break;
      }
    }
    head.print();
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    N = in.nextInt();

    cmds = new ArrayList<Cmd>(N);
    for (int i = 0; i < N; i++) {
      String cmdstr = in.next();
      if (cmdstr.equals("deleteFirst") || cmdstr.equals("deleteLast")) {
        cmds.add(new Cmd(cmdstr, 0));
      } else {
        cmds.add(new Cmd(cmdstr, in.nextInt()));
      }
    }

    //for (Cmd cmd: cmds) {
    //  System.out.println(cmd);
    //}

    // init
    run();
  }
}