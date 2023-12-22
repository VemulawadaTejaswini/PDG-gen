import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    HashMap<Character, Character> map = new HashMap<Character, Character>();
    HashSet<Character> sets = new HashSet<Character>();
    HashSet<Character> sete = new HashSet<Character>();
    map.put( ')', '(' );
    map.put( ']', '[' );
    sets.add( '(' );
    sets.add( '[' );
    sete.add( ')' );
    sete.add( ']' );

    for ( ;; ) {
      char[] str = ns().toCharArray();

      if ( str.length == 1 && str[ 0 ] == '.' ) {
        break;
      }

      LinkedList<Character> list = new LinkedList<Character>();
      list.add( '\0' );

      boolean flag = true;
      for ( char c : str ) {
        if ( sets.contains( c ) ) {
          list.addFirst( c );
        }
        if ( sete.contains( c ) ) {
          char e = list.poll();
          flag &= map.get( c ) == e;
          if(!flag) {
            break;
          }
        }
      }

      System.out.println( flag ? "yes" : "no" );
    }
  }

  Main() {
    sc = new Scanner( System.in );
  }

  int ni() {
    return sc.nextInt();
  }

  String ns() {
    return sc.nextLine();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println( Arrays.deepToString( os ) );
  }
}