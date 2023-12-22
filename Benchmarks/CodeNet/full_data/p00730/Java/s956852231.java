import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Scanner;

public class Main {
  Scanner sc;

  class BinaryTree<T> {
    T node;
    BinaryTree<T> left;
    BinaryTree<T> right;

    BinaryTree(T node) {
      this.node = node;
      left = null;
      right = null;
    }

    void addChild(T left, T right) {
      this.node = null;
      this.left = new BinaryTree<T>( left );
      this.right = new BinaryTree<T>( right );
    }

    BinaryTree<T> get(int index) {
      int ite = 0;
      Deque<BinaryTree<T>> list = new ArrayDeque<BinaryTree<T>>();
      list.push( this );
      while (list.size() > 0) {
        BinaryTree<T> e = list.pop();
        if ( e.node == null ) {
//          System.err.print( "*" );
          list.push( e.right );
          list.push( e.left );
        } else {
//          System.err.print( e.node );
          if ( ++ite > index ) {
//            System.err.println( "-" );
            return e;
          }
        }
      }

      return null;
    }

    ArrayList<T> toArrayList(int size) {
      ArrayList<T> res = new ArrayList<T>();

      Deque<BinaryTree<T>> list = new ArrayDeque<BinaryTree<T>>();
      list.push( this );
      while (list.size() > 0) {
        BinaryTree<T> e = list.pop();
        if ( e.node == null ) {
          list.push( e.left );
          list.push( e.right );
        } else {
          res.add( e.node );
        }
      }

      return res;
    }

    public String toString() {
      String str = "";
      for ( int i = 0; get( i ) != null; ++i ) {
        if ( i > 0 ) {
          str += ", ";
        }
        str += get( i ).node;
      }
      return str;
    }
  }

  class Rect {
    int w, d;

    Rect(int w, int d) {
      this.w = w;
      this.d = d;
    }

    Rect[] cut(int s) {
      Rect[] res = new Rect[2];

      s %= w + d;
      if ( s < w ) {
        res[ 0 ] = new Rect( s, d );
        res[ 1 ] = new Rect( w - s, d );
      } else {
        s -= w;
        res[ 0 ] = new Rect( w, s );
        res[ 1 ] = new Rect( w, d - s );
      }

      if ( res[ 0 ].getV() > res[ 1 ].getV() ) {
        Rect tmp = res[ 0 ];
        res[ 0 ] = res[ 1 ];
        res[ 1 ] = tmp;
      }

      return res;
    }

    int getV() {
      return w * d;
    }

    public String toString() {
      return "(" + w + ", " + d + ")";
    }
  }

  void run() {
    for ( ;; ) {
      int n, w, d;
      n = ni();
      w = ni();
      d = ni();
      if ( ( n | w | d ) == 0 ) {
        break;
      }

      Comparator<Rect> comp = new Comparator<Rect>() {
        public int compare(Rect o1, Rect o2) {
          return o1.getV() - o2.getV();
        }
      };

      BinaryTree<Rect> root = new BinaryTree<Rect>( new Rect( w, d ) );
      for ( int i = 0; i < n; ++i ) {
        int p = ni() - 1;
        int s = ni();

        BinaryTree<Rect> e = root.get( p );
        Rect[] res = e.node.cut( s );
        e.addChild( res[ 0 ], res[ 1 ] );
      }
//      debug( root );
      ArrayList<Rect> list = root.toArrayList( n + 1 );
      Collections.sort( list, comp );

      for ( int i = 0; i < n + 1; ++i ) {
        if ( i > 0 ) {
          System.out.print( " " );
        }
        System.out.print( list.get( i ).getV() );
      }
      System.out.println();
    }
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