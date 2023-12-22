import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int n = sc.nextInt();
    ArrayList<Integer> intArray = new ArrayList<Integer>();
    for(int i = 0; i < n; i++){
      intArray.add(sc.nextInt());
    }

    //output
    int sum = 0;
    if( n > 11 ){
      for(int i = 0; i < intArray.size(); i++){
        boolean divisible = false;
        for(int j = 0; j < intArray.size(); j++){
          if( i == j ){
            j++;
          }

          if( intArray.get(i)%intArray.get(j) == 0 ){
            divisible = true;
            break;
          }
        }

        if( !divisible ){
          sum++;
        }
      }
      System.out.println(sum);
    }else{
      for(int j = 0; j < 10; j++){
        //find lowest number
        if( intArray.size() > 0 ){
          int lowestNum = intArray.get(0);
          int lowestNumPosition = 0;
          for(int i = 1; i < intArray.size(); i++){
            if( intArray.get(i) < lowestNum ){
              lowestNum = intArray.get(i);
              lowestNumPosition = i;
            }else if( intArray.get(i) == lowestNum ){
              intArray.remove(i);
              i--;
            }
          }

          intArray.remove(lowestNumPosition);
          if( intArray.size() > 0 ){
            sum++;
          }
          //remove all nums divisible by lowest num
          for(int i = 0; i < intArray.size(); i++){
            if( intArray.get(i)%lowestNum == 0 ){
              intArray.remove(i);
              i--;
            }
          }
        }else{
          break;
        }
      }
      for(int i = 0; i < intArray.size(); i++){
        boolean divisible = false;
        for(int j = 0; j < intArray.size(); j++){
          if( i == j ){
            j++;
          }

          if( intArray.get(i)%intArray.get(j) == 0 ){
            divisible = true;
            break;
          }
        }

        if( !divisible ){
          sum++;
        }
      }
      System.out.println(sum);
    }

  }
}
