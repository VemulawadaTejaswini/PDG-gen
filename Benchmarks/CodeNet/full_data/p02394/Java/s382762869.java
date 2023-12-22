import java.io.*;
import java.util.Scanner;

public class Main{
               public static void main(String args[]) throws IOException{
                     int W = 0;
                     int H = 0;
                     int x = 0;
                     int y = 0;
                     int r = 0;

                     Scanner in = new Scanner(System.in);
                     
                     String buf1 = in.next();
                     String buf2 = in.next();
                     String buf3 = in.next();
                     String buf4 = in.next();
                     String buf5 = in.next();
                     
                     W = Integer.parseInt(buf1);
                     H = Integer.parseInt(buf2);
                     x = Integer.parseInt(buf3);
                     y = Integer.parseInt(buf4);
                     r = Integer.parseInt(buf5);

                     if(r <= x && x <= W-r && r <= y && y <= H-r){
                          System.out.println("Yes");
                     }else{
                          System.out.println("No");
                     }

            }
   }