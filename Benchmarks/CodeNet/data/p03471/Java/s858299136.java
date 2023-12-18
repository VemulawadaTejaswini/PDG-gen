import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Y = sc.nextInt();
    int y = 0;
    int z = 0;
    int x;
    for(x = 0; x <= 20000; x++) {
      z = (5000*N-Y+5000*x)/4000;
      y = N-x-z;
      if(x+y+z == N && y >= 0 && z >= 0 && 10000*x+5000*y+1000*z==Y) {
        break;
      }
    }
    if(x + y + z == N && 10000*x+5000*y+1000*z==Y) {
      System.out.println(x + " " + y + " " + z); 
    }
    else
      System.out.println("-1 -1 -1");
  }
}
