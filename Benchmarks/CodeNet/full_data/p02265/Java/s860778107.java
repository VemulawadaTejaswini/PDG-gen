import java.util.*;

public class Main {
  static int max = 1000000;
  static int[] prev = new int[max];
  static int[] next = new int[max];
  static int[] arr = new int[max];
  static int nil = 0;
  static int ite = 0;

  public static void init() {
    prev[nil] = nil;
    next[nil] = nil;
    ite = 0;
  }
  public static void insert(int x) {
    ite++;
    int a = next[nil];
    next[nil] = ite;
    next[ite] = a;
    prev[ite] = nil;
    prev[a] = ite;
    arr[ite] = x;
  }
  public static int serch(int x) {
    int a = next[nil];
    while(true) {
      if(a == 0) {
        break;
      } else if(arr[a] == x) {
        break;
      } else {
        a = next[a];
      }
    }
    return a;
  }
  public static void delete(int x) {
    int a = serch(x);
    next[prev[a]] = next[a];
    prev[next[a]] = prev[a];
  }
  public static void deleteFirst() {
    next[nil] = next[next[nil]];
    prev[next[nil]] = nil;
  }
  public static void deleteLast() {
    prev[nil] = prev[prev[nil]];
    next[prev[nil]] = nil;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = "";
    int m = 0;
    for(int i = 0; i < n; i++) {
      s = sc.next();
      if(s.equals("insert")) {
        m = sc.nextInt();
        insert(m);
      } else if(s.equals("delete")) {
        m = sc.nextInt();
        delete(m);
      } else if(s.equals("deleteFirst")) {
        deleteFirst();
      } else {
        deleteLast();
      }
    }
    int l = next[nil];
    while(true) {
      if(next[l] == nil) {
        System.out.println(arr[l]);
        break;
      } else {
        System.out.print(arr[l] + " ");
        l = next[l];
      }
    }
  }
}

