import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   double N = sc.nextDouble();

   double sq = Math.sqrt(N);
   sq = Math.floor(sq);
   
   int anssq = (int) sq;
   
   System.out.println(anssq*anssq);
 }
}