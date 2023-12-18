import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = Integer.parseInt(String.valueOf(scan.nextLine()));

    int[] note = new int[n];

    int total = 0;

    for (int i = 0; i < n; i++){
      note[i] = Integer.parseInt(scan.nextLine());
      total += note[i];
    }

    if (total % 10 == 0){

      int nb = nbNotMultiple(note);

      if (note[nb] % 10 == 0) {
        System.out.println(0);
      }
      else{
        System.out.println(total - note[nb]);
      }

    }
    else{
      System.out.println(total);
    }



  }

  public static  int nbNotMultiple (int[] elem) {
    int min = 0;
    for (int i = 0; i < elem.length; i++){
      if (elem[i] % 10 != 0 && elem[min] > elem[i]){
        min = i;
      }
    }
    return min;
  }


}
