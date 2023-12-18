import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    if((scn.nextInt() & scn.nextInt()) == 1){
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }
}