import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
      int r = scan.nextInt();
      double pi = Math.PI;
      double S = pi * r * r;
      double L = 2 * pi * r;
      System.out.println(S + " " + L);
     }
    }
