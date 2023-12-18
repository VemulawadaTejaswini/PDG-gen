import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int count = 0;
    for(int i = 1; i <= N; i++) {
      int test = i;
      int num = 0;
      while( test > 0 ) {
        test /= 10;
        num++;
      }
      if( num % 2 != 0 ){
        count++;
      }
    }
    System.out.println(count);
  }
}
