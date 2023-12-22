import java.util.Scanner;

public class Main{
  
  public static void main(String[] args) {
    
    Scanner sin = new Scanner(System.in);

    int[] origin = new int[3];
    origin[0] = sin.nextInt();
    origin[1] = sin.nextInt();
    origin[2] = sin.nextInt();

    for( int i = 0, exch; i < origin.length -1; i++) {
      for( int j = 1; j < origin.length - i; j++)
      if( origin[j-1] > origin[j] ) {
        exch = origin[j-1];
        origin[j-1] = origin[j];
        origin[j] = exch;
      }
    }

    System.out.println(origin[0] + " " + origin[1] + " " + origin[2]);
    sin.close();
  }
}
