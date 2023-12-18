import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int L = sc.nextInt();
    int R = sc.nextInt();

    sc.close();

    int r = Math.min(R, L+4038);

    int min = 2018;
    
    for (int i = L; i <= r; i++){
      for (int j = i + 1; j <= r; j++){
        min = Math.min(min, (i*j)%2019);
      }
    }

    System.out.println(min);
    
  }

}