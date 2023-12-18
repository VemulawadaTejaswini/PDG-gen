import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int X = sc.nextInt();
   int Y = sc.nextInt();
   int Z = sc.nextInt();
   X -=Y+2*Z;
   System.out.println(1+X/(Y+Z));
 }
}