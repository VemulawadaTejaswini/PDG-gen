import java.util.*;
import java.io.*;

public class Main{
 public static void main(String[] args){
   Scanner s = new Scanner(System.in);
   int a = s.nextInt();
   int b = s.nextInt();
   int t = s.nextInt();
   
   int r = t/a;
   System.out.print(r*b);
 }
}