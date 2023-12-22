import java.util.*;

public class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt(), Y=sc.nextInt(), S=0;
    Boolean b = false;
    for(int i=0; i<=X; i++) {
      S=i*2 + (X-i) * 4; 
      if(S==Y) {
        b = true;
        break;
      }
	}
    if(b) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
