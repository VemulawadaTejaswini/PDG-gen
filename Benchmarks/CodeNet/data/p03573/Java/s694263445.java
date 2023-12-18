import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int s1 = sc.nextInt();
   int s2 = sc.nextInt();
   int s3 = sc.nextInt();
   if(s1==s2) System.out.println(s3);
   else if(s2==s3) System.out.println(s1);
   else System.out.println(s2);
 }
}