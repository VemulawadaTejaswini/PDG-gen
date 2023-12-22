import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i=0; i<n; i++){
      switch (sc.next()){
        case "insert":
          Node.insert(sc.nextInt());
          break;
        case "print":
          Node.print();
          break;
        case "find":
          System.out.println(Node.find(sc.nextInt())?"yes":"no");
          break;
        case "delete":
          Node.delete(sc.nextInt());
          break;
      }
    }
  }
}

class Node{
  private int key=-1;
  private Node p=null;
  private Node l=null;
  private Node r=null;
  private static Node root=null;

  public void pre(){
    System.out.print(" "+key);
    if (l!=null) l.pre();
    if (r!=null) r.pre();
  }

  public void in(){
    if (l!=null) l.in();
    System.out.print(" "+key);
    if (r!=null) r.in();
  }

  public void post(){
    if (l!=null) l.post();
    if (r!=null) r.post();
    System.out.print(" "+key);
  }

  public int childNum(){
    int c=0;
    if (l != null) c++;
    if (r != null) c++;
    return c;
  }

  private Node(int key, Node l, Node r){
    this.key = key;
    this.l = l;
    this.r = r;
  }

  public static void insert(int v){
    insert(new Node(v,null,null));
  }

  private static void insert(Node z){
    Node y = null;
    Node x = root;
    while (x != null){
      y = x;
      if (z.key < x.key){
        x = x.l;
      } else {
        x = x.r;
      }
    }
    z.p = y;
    if (y==null){
      root = z;
    } else if (z.key<y.key){
      y.l = z;
    } else {
      y.r = z;
    }
  }

  public static boolean find(int k){
    Node x = root;
    while (x != null){
      if (k == x.key) return true;
      else if (k < x.key){
        x = x.l;
      } else {
        x = x.r;
      }
    }
    return false;
  }

  public static void delete(int k){
    Node x = root;
    Node z = null;
    while (x != null){
      if (k == x.key) {
        z = x;
        break;
      }
      else if (k < x.key){
        x = x.l;
      } else {
        x = x.r;
      }
    }
    if (z==null) return;
    if (z.p==null){
      root = null;
      return;
    }
    switch(z.childNum()){
      case 0:
        if (z.p.l == z) z.p.l = null;
        else z.p.r = null;
        break;
      case 1:
        Node c;
        if (z.l != null) c = z.l;
        else c = z.r;
        if (z.p.l == z) z.p.l = c;
        else z.p.r = c;
        c.p = z.p;
        break;
      case 2:
        Node y = z.r;
        while (y.l!=null) y = y.l;
        z.key = y.key;
        if (y.childNum()==0){
          if (y.p.l == y) y.p.l = null;
          else y.p.r = null;
        } else {
          Node yc;
          if (y.l != null) yc = y.l;
          else yc = y.r;
          if (y.p.l == y) y.p.l = yc;
          else y.p.r = yc;
          yc.p = y.p;
        }
        break;
    }
  }

  public static void print(){
    root.in();
    System.out.println();
    root.pre();
    System.out.println();
  }
}

