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
    int A = scan.nextInt();
    int B = scan.nextInt();
    int C = scan.nextInt();
    if(A == B){
      System.out.println(C);
    }
    else if(B == C){
      System.out.println(A);
    }
    else{
      System.out.println(B);
    }
  }
}