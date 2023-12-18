import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int s1 = sc.nextInt();
   int s2 = sc.nextInt();
   int s3 = sc.nextInt();
 
   if(Math.abs(s1-s2)>Math.abs(s1-s3))System.out.println("B");
   else System.out.println("A");
 }
}