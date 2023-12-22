import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int h = sc.nextInt();
    int w = sc.nextInt();
    int k = sc.nextInt();
    char[][] list = new char[h][w];
    int numBlack = 0;
    for(int r = 0; r < list.length; r++){
      String rowString = sc.next();
      for(int c = 0; c < list[r].length; c++){
        list[r][c] = rowString.charAt(c);
        if( list[r][c] == '#' ){
          numBlack++;
        }
      }
    }

    //output
    //calculate all combinations
    int allSum = 0;
    for(int r = 0; r < list.length; r++){
      int rowCombination = (factorial(h))/(factorial(h-r)*factorial(r)); //h choose r
      for(int c = 0; c < list[r].length; c++){
        int colCombination = (factorial(w))/(factorial(w-c)*factorial(c)); //w choose c
        allSum += rowCombination*colCombination;
      }
    }
    //System.out.println(allSum);

    if( numBlack < k ){
      System.out.println(0); //impossible
    }else if( numBlack == k ){

      int numOfRowPossible = 0;
      for(int r = 0; r < list.length; r++){
        boolean atLeastOneBlack = false;
        for(int c = 0; c < list[r].length; c++){
          if( list[r][c] == '#' ){
            atLeastOneBlack = true;
            break;
          }
        }
        if( atLeastOneBlack ){
        }else{
          numOfRowPossible++;
        }
      }

      int numOfColPossible = 0;
      for(int c = 0; c < list[0].length; c++){
        boolean atLeastOneBlack = false;
        for(int r = 0; r < list.length; r++){
          if( list[r][c] == '#' ){
            atLeastOneBlack = true;
            break;
          }
        }
        if( atLeastOneBlack ){
        }else{
          numOfColPossible++;
        }
      }

      //System.out.println("numOfColPossible"+numOfColPossible+"numOfRowPossible"+numOfRowPossible);

      if( numOfRowPossible == 0 && numOfColPossible == 0 ){
        System.out.println(1);
      }else if( numOfRowPossible == 0 ){

        int sameAllSum = 0;
        for(int c = 0; c < numOfColPossible; c++){
          int sameColCombination = (factorial(numOfColPossible))/(factorial(numOfColPossible-c)*factorial(c)); //w choose c
          sameAllSum += 1*sameColCombination;
        }
        System.out.println(sameAllSum);

      }else if( numOfColPossible == 0 ){

        int sameAllSum = 0;
        for(int r = 0; r < numOfRowPossible; r++){
          int sameRowCombination = (factorial(numOfRowPossible))/(factorial(numOfRowPossible-r)*factorial(r)); //w choose c
          sameAllSum += 1*sameRowCombination;
        }
        System.out.println(sameAllSum);

      }else{
        int sameAllSum = 0;
        for(int r = 0; r < numOfRowPossible; r++){
          int sameRowCombination = (factorial(numOfRowPossible))/(factorial(numOfRowPossible-r)*factorial(r)); //h choose r
          for(int c = 0; c < numOfColPossible; c++){
            int sameColCombination = (factorial(numOfColPossible))/(factorial(numOfColPossible-c)*factorial(c)); //w choose c
            sameAllSum += sameRowCombination*sameColCombination;
          }
        }

        System.out.println(sameAllSum);
      }

    }else{

      System.out.println(0);

    }


  }

  public static int factorial(int n){
    if(n == 0){
      return 1;
    }
    return n*factorial(n-1);
  }
}
