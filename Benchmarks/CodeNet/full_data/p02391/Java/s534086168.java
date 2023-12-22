import java.io.*;
import java.util.Scanner;

public class Main{
               public static void main(String args[]) throws IOException{
                     int a = 0;
                     int b = 0;
                   
                     Scanner in = new Scanner(System.in);
                     
                     String buf1 = in.next();
                     String buf2 = in.next();
                     
                     a = Integer.parseInt(buf1);
                     b = Integer.parseInt(buf2);

                        if(a > b){
                          System.out.println("a > b");
                       }else if(a < b){
                          System.out.println("a < b");
                       }else if(a == b){
                           System.out.println("a == b");
                       }

              }
      }


         