
import java.io.*;
import java.util.Scanner;

public class Main{
               public static void main(String args[]) throws IOException{
                     int a = 0;
                     int b = 0;
                     int c = 0;
                   
                     Scanner in = new Scanner(System.in);
                     
                     String buf1 = in.next();
                     String buf2 = in.next();
                     String buf3 = in.next();
                     
                     a = Integer.parseInt(buf1);
                     b = Integer.parseInt(buf2);
                     c = Integer.parseInt(buf3);
               
                     if(a < b && b < c){
                          System.out.println(a +" "+ b +" "+ c);
                     }else if(a < c && c < b){
                          System.out.println(a +" "+ c +" "+ b);
                     }else if(b < a && a < c){
                          System.out.println(b +" "+ a +" "+ c);
                     }else if(b < c && c < a){
                          System.out.println(b +" "+ c +" "+ a);
                     }else if(c < a && a < b){
                          System.out.println(c +" "+ a +" "+ b);
                     }else if(c < b && b < a){
                          System.out.println(c +" "+ b +" "+ a);
                     }else if(a == b && b < c){
                          System.out.println(a +" "+ b +" "+ c);
                     }else if(a == b && b > c){
                          System.out.println(c +" "+ a +" "+ b);
                     }else if(a == c && b > c){
                          System.out.println(a +" "+ c +" "+ b);
                     }else if(a == c && b < c){
                          System.out.println(b +" "+ a +" "+ c);
                     }else if(b == c && a > c){
                          System.out.println(b +" "+ c +" "+ a);
                     }else if(b == c && a < c){
                          System.out.println(a +" "+ b +" "+ c);
                     }else{
                          System.out.println(a +" "+ b +" "+ c);
                     }
                     
            }
 }