 import java.util.Scanner;
import java.util.*;
    public class Main {
        public static void main(String args[]) {
          
          Scanner sc = new Scanner(System.in);
          
          int a,b,c;
          
          int sum = 0;
          
          a = sc.nextInt();
          b = sc.nextInt();
          c = sc.nextInt();
          
          sc.close();
          
          sum = a * b / 2;
          
          System.out.print(sum);
          
        }
    }