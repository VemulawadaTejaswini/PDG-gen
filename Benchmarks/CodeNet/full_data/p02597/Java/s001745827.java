import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
import java.math.BigInteger;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    String c = scan.next();
    String[] split = c.split("");
    int indicate = N - 1;
    int count = 0;
    for (int i = 0;i < indicate;i++) {
      if (split[i].equals("W")) {
        while(split[indicate].equals("W")){
          indicate -= 1;  
          if (indicate < 0) {
            System.out.println(count);
            return;
          }
        }
        split[i] = "R";
        split[indicate] = "W";
        count += 1;
      }
    }
    System.out.println(count);
  }
}