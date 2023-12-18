import java.util.*;
import java.lang.*;

class Main {
  public static void main(String []_){
    Vector<int> bet = new Vector<int>();

    int n, m;
    int i;
    int a, b;
    int len;

    Scanner input = new Scanner(System.in);

    n = input.nextInt();
    m = input.nextInt();
    for(i=0; i<m; i++){
      a = input.nextInt();
      b = input.nextInt();
      if(a==1){
        if(bet.indexOf(b)){
          System.out.println("Possible");
          System.exit(0);
        }
        bet.add(b);
      }
      if(b==n){
        if(bet.indexOf(a)){
          System.out.println("Possible");
          System.exit(0);
        }
        bet.add(a);
      }
    }

    System.out.println("Inpossible");
    return 0;    
  }
}