import java.util.Scanner;
 
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    long n = sc.nextLong();
    long[] array = new long[5];
    for (int i=0; i<array.length; i++) {
      array[i] = sc.nextLong();
    }
    
    long min_move = array[0];
    for (int i=1; i<array.length; i++) {
      if (array[i] < min_move) {
        min_move = array[i];
      }
    }
    
    long result = 4L;
    result += (long)n/min_move;
    if (n % min_move != 0) {
    	result += 1L;
    }
    System.out.println(result);
  }
}