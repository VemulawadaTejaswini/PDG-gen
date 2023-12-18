import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int count = 0;
    for ( int i = 1; i <= N; i += 2) {
        int isYaku = 0;
      for( int j = 1; j <= i; j++ ) {
        if( i % j == 0 ) {
          isYaku++;
        }
      }
      if( isYaku == 8 ) {
        count++;
      }
    }
    System.out.println(count);
  }
}

      
