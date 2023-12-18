import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int x = scan.nextInt();
    int y = scan.nextInt();
    int x_max = 0;
    int y_min = 0;
    boolean flag = false;

    for(int i = 0; i < n; i++){
      int tmp = scan.nextInt();
      if(i == 0)  x_max = tmp;
      x_max = Math.max(x_max, tmp);
    }

    for(int i = 0; i < m; i++){
      int tmp = scan.nextInt();
      if(i == 0)  y_min = tmp;
      y_min = Math.min(y_min, tmp);
    }

    for(int z = x_max+1; z <= y_min; z++){
      if(x < z && z <=y){
        if(x_max < y_min){
          flag = true;
          break;
        }
      }
    }

    if(flag == true)
      System.out.println("No War");
    else
    System.out.println("War");

  }
}
