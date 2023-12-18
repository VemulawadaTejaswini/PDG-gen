
 
import java.io.*;
import java.util.*;


public class Main {

  public static void main(String[] args)  {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int X = sc.nextInt();
    for(int i =1; i<=N; i++){
      int ai = sc.nextInt();
      for(int d = 1; d<=D; d+=ai){
         X++;
      }
    }
    System.out.println(X);
  }
}
