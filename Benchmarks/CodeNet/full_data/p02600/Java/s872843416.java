import java.util.Scanner;
 public class Main{
   public static void main(String[] args){
     Scanner stdIn = new Scanner(System.in);
     
     int x = stdIn.nextInt();
     
       if (x >= 400 && x <= 599){System.out.print("8"); }
       else if (x >= 600 && x <= 799) {System.out.print("7");}
       else if (x >= 800 && x <= 999) {System.out.print("6");}
       else if (x >= 1000 && x <= 1199) {System.out.print("5");}
       else if (x >= 1200 && x <= 1399) {System.out.print("4");}
       else if (x >= 1400 && x <= 1599) {System.out.print("3");}
       else if (x >= 1600 && x <= 1799) {System.out.print("2");}
       else if (x >= 1800 && x <= 1999) {System.out.print("1");}
                                
   }
 }