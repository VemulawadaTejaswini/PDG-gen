import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  int[] atom = new int[3];
  char[] str;
  int index;

  boolean isAtom(char c) {
    switch ( c ) {
    case '0':
    case '1':
    case '2':
    case 'P':
    case 'Q':
    case 'R':
      return true;
    default:
      return false;
    }
  }

  Tree make() {
    Tree tree = new Tree();
    if ( isAtom(str[index]) ) {
      tree.type = str[index];
      ++index;
    } else {
      if(str[index] == '-') {
        tree.type = str[index++];
        tree.left = make();
      } else {
        ++index; // (
        tree.left = make();
//        debug(index, str[index]);
        tree.type = str[index++];
        tree.right = make();
        ++index; // )
      }
    }
    return tree;
  }

  class Tree {
    char type;

    Tree left;
    Tree right;

    Tree() {
    }

    int exp() {
      switch ( type ) {
      case '0':
      case '1':
      case '2':
        return type - '0';
      case 'P':
      case 'Q':
      case 'R':
        return atom[ type - 'P' ];
      case '+':
        return Math.max( left.exp(), right.exp() );
      case '*':
        return Math.min( left.exp(), right.exp() );
      case '-':
        return 2 - left.exp();
      default:
        return -1;
      }
    }
  }

  void run() {
    for ( ;; ) {
      str = sc.next().toCharArray();
      if ( str[ 0 ] == '.' ) {
        break;
      }
      index = 0;
      Tree root = make();
      int cnt = 0;
      for ( int i = 0; i < 3; ++i ) {
        for ( int j = 0; j < 3; ++j ) {
          for ( int k = 0; k < 3; ++k ) {
            atom[ 0 ] = i;
            atom[ 1 ] = j;
            atom[ 2 ] = k;
            if ( root.exp() == 2 ) {
              ++cnt;
            }
          }
        }
      }
      System.out.println( cnt );
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