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
    int L = scan.nextInt();
    int R = scan.nextInt();
    int d = scan.nextInt();
    int ans = 0;
    L = L / d;
    R = R / d;
    ans = R - d;
    System.out.println(ans);
    }
  }
}