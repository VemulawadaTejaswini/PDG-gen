import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int[] NumData = new int[3];
    int min;

    for(int i = 0; i < 3 ; i++){
      NumData[i] = scan.nextInt();
    }
    Arrays.sort(NumData);

    System.out.println(NumData[2] * 10 + NumData[1] + NumData[0]);

  }
}
