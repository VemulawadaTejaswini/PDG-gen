import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int suti = scan.nextInt();
    int i, j, k;
    int check;
    boolean atteru = false,tigau = true;
    for (i = 1; i <= 9; i++ ) {
      for(k = 0;k <= 9; k++){
        check = 1000*i + 100*i + 10*i + k;
        if (check == suti) {
          atteru = true;
          tigau = false;
        }
      }
    }
    for (i = 0; i <= 9; i++ ) {
      for(k = 1;k <= 9; k++){
        check = 1000*k + 100*i + 10*i + i;
        if (check == suti) {
          atteru = true;
          tigau = false;
        }
      }
    }
    if(atteru == true){
      System.out.println("Yes");
    } else if (tigau == true) {
      System.out.println("No");
    }
  }
}
