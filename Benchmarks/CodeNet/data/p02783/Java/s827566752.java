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
    int H = scan.nextInt();
    int A = scan.nextInt();
    int count = 1;
    while(H - A > 0){
      count += 1;
      H = H - A;
    }  
    System.out.println(count);
  }
}

