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
    long A = scan.nextLong();
    long B = scan.nextLong();
    long K = scan.nextLong();
    if (K < A) {
      System.out.println(A - K +" "+ B);
    }
    else if (A + B >= K){
      long C = B + A - K;
      System.out.println(0 +" "+ C);
    }
    else{
      System.out.println(0 + " " + 0);
    }
  }
}
