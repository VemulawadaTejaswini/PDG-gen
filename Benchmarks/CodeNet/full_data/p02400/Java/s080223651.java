import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      double r=sc.nextDouble();
      double S=(double)Math.PI*r*r;
      double M=(double)2.0*Math.PI*r;
      System.out.println(S+" "+M);
    }
}
