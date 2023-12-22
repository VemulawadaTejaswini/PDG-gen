import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    int n = ni();
    for ( int i = 0; i < n; ++i ) {
      L = 0;

      String str = sc.next();
      Pair<Node, Integer> p = make( str.toCharArray(), 0, 0 );
      cal( p.f, 0 );

      System.out.println( p.f.v );
    }
  }

  class Pair<T, U> {
    T f;
    U s;

    Pair(T t, U u) {
      f = t;
      s = u;
    }
  }

  class Node {
    int v;
    LinkedList<Node> children;

    Node() {
      children = new LinkedList<Node>();
    }

    void add(Node node) {
      children.add( node );
    }
  }

  void cal(Node node, int depth) {
//    debug(depth, L);
    if ( depth == L - 2 ) {
//      debug("\tb:", node.v);
      node.v = node.children.getFirst().v;
//      debug("\tb:", node.v);
    } else if ( depth == L - 3 ) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      for ( Node ch : node.children ) {
        cal(ch, depth + 1);
        list.add( ( ch.v + 1 ) / 2 );
      }
      Collections.sort( list );
      int sum = 0;
      for ( int i = 0; i < ( list.size() + 1 ) / 2; ++i ) {
        sum += list.get( i );
      }
      node.v = sum;
    } else {
      ArrayList<Integer> list = new ArrayList<Integer>();
      for ( Node ch : node.children ) {
        cal(ch, depth + 1);
        list.add( ch.v );
      }
      Collections.sort( list );
      int sum = 0;
      for ( int i = 0; i < ( list.size() + 1 ) / 2; ++i ) {
        sum += list.get( i );
      }
      node.v = sum;
    }
  }

  int L;

  Pair<Node, Integer> make(char[] str, int idx, int depth) {
    L = Math.max( L, depth + 1 );

    Node node = new Node();

    if ( str[ idx ] == '[' ) {
      while (str[ ++idx ] != ']') {
        Pair<Node, Integer> p = make( str, idx, depth + 1 );
        node.add( p.f );
        idx = p.s;
      }
    } else {
      // numecal
      ArrayList<Character> list = new ArrayList<Character>();
      while (str[ idx ] != ']') {
        list.add( str[ idx++ ] );
      }
      --idx;
      int len = list.size();
      char[] nums = new char[len];
      for ( int i = 0; i < len; ++i ) {
        nums[ i ] = list.get( i );
      }
      node.v = Integer.parseInt( new String( nums ) );
    }

    return new Pair<Node, Integer>( node, idx );
  }

  Main() {
    sc = new Scanner( System.in );
  }

  int ni() {
    return sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println( Arrays.deepToString( os ) );
  }

}