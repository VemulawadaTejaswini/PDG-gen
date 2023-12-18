import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    double M = N/3.0;
    System.out.println(M*M*M);
  }
}