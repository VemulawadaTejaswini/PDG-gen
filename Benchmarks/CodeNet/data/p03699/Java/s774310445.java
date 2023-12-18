import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = Integer.parseInt(String.valueOf(scan.nextLine()));
    int[] elem = new int[n];

    int total = 0;

    for (int i = 0; i < n; i++){
      elem[i] = Integer.parseInt(scan.nextLine());
      total += elem[i];
    }

    if (total % 10 == 0){
      System.out.println(0);
    }
    else{
      System.out.println(total);
    }



  }

}
