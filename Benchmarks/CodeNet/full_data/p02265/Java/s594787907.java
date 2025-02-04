import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

enum CmdOp {
  INSERT("insert"),
  DELETE("delete"),
  DELETE_FIRST("deleteFirst"),
  DELETE_LAST("deleteLast"),
  UNDEFINED("UNDEFINED");

  private String name;

  private CmdOp(String str) {
    this.name = str;
  }

  private String getName() {
    return name;
  };

  @Override
  public String toString() {
    return getName();
  }

  public static CmdOp cmdStrToCmdOp(String cmd) {
    CmdOp ret;
    switch(cmd) {
      case "insert":
        ret = CmdOp.INSERT;
        break;
      case "delete":
        ret = CmdOp.DELETE;
        break;
      case "deleteFirst":
        ret = CmdOp.DELETE_FIRST;
        break;
      case "deleteLast":
        ret = CmdOp.DELETE_LAST;
        break;
      default:
        ret = CmdOp.UNDEFINED;
        break;
    }

    return ret;
  }

}


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