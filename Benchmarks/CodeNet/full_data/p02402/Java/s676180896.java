import java.util.Scanner;

class Main {
  public static void main(String... args) {

    Scanner scan = new Scanner(System.in) ;

    int n = scan.nextInt() ;

    int[] arr = new int[n];

    scan = new Scanner(System.in) ;

    for (int i=0; i<n; i++) arr[i] = scan.nextInt() ;

    int max = Integer.MIN_VALUE ;
    int min = Integer.MAX_VALUE ;
    int sum = 0 ;

    for (int i: arr) {

      if(i > max) max = i ;
      if(i < min) min = i ;
      sum += i ;
    }

    System.out.println(min + " " + max + " " + sum ) ;

  }
}
