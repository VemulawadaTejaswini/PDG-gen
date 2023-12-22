import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();
    int i = 1;
    while (true) {
      if (i*x%360==0) {
        System.out.println(i);
    	break;
      }
    	i++;
    }
    
    sc.close();
  }
}