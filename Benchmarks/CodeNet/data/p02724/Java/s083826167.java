import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int div = n / 500;
     int sub = n - div * 500 ;
     int res = sub / 5;
     System.out.println(div * 1000 + res * 5);
  }
}
