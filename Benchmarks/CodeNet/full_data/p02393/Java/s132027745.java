import java.util.Scanner;

public class Main{
  
  public static void main(String[] args) {
    
    Scanner sin = new Scanner(System.in);

    int[] num = new int[3];
    num[0] = sin.nextInt();
    num[1] = sin.nextInt();
    num[2] = sin.nextInt();

    for( int i = 0, tmp; i < num.length -1; i++) {
      for( int j = 1; j < num.length - i; j++)
      if( num[j-1] > num[j] ) {
        temp = num[j-1];
        num[j-1] = num[j];
        num[j] = tmp;
      }
    }

    System.out.println(num[0] + " " + num[1] + " " + num[2]);
    sin.close();
  }
}
