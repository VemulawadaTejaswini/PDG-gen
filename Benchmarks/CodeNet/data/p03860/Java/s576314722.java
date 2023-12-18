import java.util.*;

class Main{

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String chaineNombre = scan.nextLine();

    String[] numberString = chaineNombre.split(" ");

    int a = Integer.parseInt(numberString[0]);
    int b = Integer.parseInt(numberString[1]);
    int x = Integer.parseInt(numberString[2]);

    int compteur = 0;

    while (a <= b){

      if (a % x == 0){
        compteur++;
      }

      a++;
    }

    System.out.println(compteur);

  }


}
