import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     int x = scanner.nextInt();
     int y = scanner.nextInt();
     int a;

     if(x<y){
       a=x;
     }else{
       a=y;
     }

     while(true){
       if(x%a==0&&y%a==0)break;
       a--;
     }
     System.out.println(a);
  }

}

