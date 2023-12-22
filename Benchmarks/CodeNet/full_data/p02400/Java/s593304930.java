import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.lang.Object;
import java.lang.Math;


public class Main {
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
      int r = scan.nextInt();
      double S = Math.PI * r * r;
      double L = 2 * Math.PI * r;
      System.out.println(S + " " + L);
     }
    }
