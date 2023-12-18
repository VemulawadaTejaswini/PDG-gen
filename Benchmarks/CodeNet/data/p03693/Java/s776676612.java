import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int r = sc.nextInt();
   int g = sc.nextInt();
   int b = sc.nextInt();
   
   System.out.println((r*g*b)%4 == 0 ? "YES":"NO");
   
 }
}