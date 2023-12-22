import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     int n = scanner.nextInt();
     int a = scanner.nextInt();
     int b = scanner.nextInt();
     int c = scanner.nextInt();
     int d = scanner.nextInt();

     int x = 0;
     int y = 0;
     int i = 0;
     int j = 0;


     while(true){
       i = i + a;
       x = x + b;
       if(i>=n)break;
     }

     while(true){
       j = j + c;
       y = y + d;
       if(j>=n)break;
     }

     if(x<y){
       System.out.println(x);
     }else{
       System.out.println(y);
     }


  }
}
