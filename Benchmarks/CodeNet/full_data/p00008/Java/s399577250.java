import java.util.Scanner;
import java.util.ArrayList;

class Main{
  public static void main(String[] args){
    ArrayList<Integer> array = new ArrayList<Integer>();
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    for (int i = 0; i < 10; i++){
      for (int j = 0; j < 10; j++){
        for (int k = 0; k < 10; k++){
          for (int l = 0; l < 10; l++){
            //System.out.println(i + "," + j + "," + k + "," + l);
            int total = i + j + k + l;
            if (total == n ){
              //System.out.println(i + "," + j + "," + k + "," + l);
             array.add(1);
            }
          }
        }
      }
    }
   System.out.println(array.size());
  }
}