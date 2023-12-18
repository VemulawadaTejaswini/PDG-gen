import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	String s = sc.next();
    int n = s.length();
    String c[] = new String[n];

    for(int i=0; i<n; i++) {
      c[i] = s.substring(i, i+1);
    }
    
    for(int i=0; i<n; i++){
      if (i%2 == 1) { //even
        if (c[i].equals("R")) {
          System.out.println("No");
          return;
        }
      } else { //odd
        if (c[i].equals("L")) {
          System.out.println("No");
          return;
        }
      }
    }
    
    System.out.println("Yes");
    
  }
}
