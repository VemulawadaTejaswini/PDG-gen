import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    String[] splitS = S.split("");
    String T = scan.next();
    String[] splitT = T.split("");
    int n = S.length();
    int count = 0;
    for (int i = 0;i < n;i++) {
      if (splitS[i].equals(splitT[i])) {
      }
      else{
        count += 1;
      }
    }
    System.out.println(count);
  }
}
