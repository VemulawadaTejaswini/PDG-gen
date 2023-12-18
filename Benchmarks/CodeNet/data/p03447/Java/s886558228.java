import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int X = sc.nextInt();
   int A = sc.nextInt();
   int B = sc.nextInt();
   
   int n = (X-A)/B;
   System.out.println(X-A-B*n);
 }
}