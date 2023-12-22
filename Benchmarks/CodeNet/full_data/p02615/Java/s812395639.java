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
    long n = scan.nextLong();
    long put = scan.nextInt();
    long sum = 0;
    for (int i = 1;i < n;i++) {
      long enter = scan.nextLong();
      if (put <= enter) {
        sum += enter;
      }
      else {
        sum += put;
        enter = put;
      }
    }
    System.out.println(sum);
  }
}
