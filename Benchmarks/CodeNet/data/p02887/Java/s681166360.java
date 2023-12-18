import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    String src;
    int n;
    
    Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
    src = sc.next();

    int count = 0;
    char c = ' ';
    
    for (int i = 0; i < src.length(); i++) {
      if ( c != src.charAt(i) ) {
        count++;
        c = src.charAt(i);
      }
    }
    
    System.out.println(count);
    
    return;
  }
}

    
    
    