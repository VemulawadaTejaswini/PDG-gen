import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   String s=kbd.next();
   if(s.equals("A")||s.equals("B")||s.equals("C")||s.equals("D")||s.equals("E")||s.equals("F")||s.equals("G")||s.equals("H")||s.equals("I")||s.equals("J")||
   s.equals("K")||s.equals("L")||s.equals("M")||s.equals("N")||s.equals("O")||s.equals("P")||s.equals("Q")||s.equals("R")||s.equals("S")||s.equals("T")||
   s.equals("U")||s.equals("V")||s.equals("W")||s.equals("X")||s.equals("Y")||s.equals("Z")){
     System.out.println("A");
   }else{
      System.out.println("a");
   }
 }
}
