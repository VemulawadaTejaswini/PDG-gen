import java.util.*;

class Main{

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String parametre = scan.nextLine();
    String[] sousParametre = parametre.split(" ");

    int n = Integer.parseInt(sousParametre[0]);
    int x = Integer.parseInt(sousParametre[1]);

    String nbCandies = scan.nextLine();
    String[] tabNbCandies = nbCandies.split(" ");
    int[] tabNbCandiesInt = new int[tabNbCandies.length];

    int operation = 0;

    for (int i = 0; i < n; i++){
      tabNbCandiesInt[i] = Integer.parseInt(tabNbCandies[i]);


      while (tabNbCandiesInt[i] > x){
          tabNbCandiesInt[i]--;
          operation++;
      }

      if (i > 0){
        if(tabNbCandiesInt[i] + tabNbCandiesInt[i-1] > x){
          tabNbCandiesInt[i]--;
          operation++;
        }
      }

    }

    System.out.println(operation);


  }


}
