import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      int d = a / b;
      int r = a % b;
      double f = a / (double)b;
      System.out.printf(d + " " + r + " " + "%.8f",f );
     }
    }
