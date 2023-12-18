import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    int i;
    Scanner sc = new Scanner( System.in );
    String str = sc.next();

    String[] stringArray = {"Sunny", "Cloudy", "Rainy"};
    
    for ( i = 0; i < stringArray.length; i ++ ) {
      if (str.equals(stringArray[i])) {
        break;
      }
    }

    System.out.println(stringArray[( i + 1 ) % stringArray.length]);
  }
}