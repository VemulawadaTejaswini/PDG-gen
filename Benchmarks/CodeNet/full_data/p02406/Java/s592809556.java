import java.util.*;
import java.io.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i;
    out.printf(" ");
    for(i=1; i<=n; i++){
      if(i % 3 == 0){
        out.printf(i+" ");
      }else if(i % 10 == 3){
        out.printf(i+" ");
      }
    }
    out.println();
  }
}
