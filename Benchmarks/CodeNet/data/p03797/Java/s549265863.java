import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  long N = sc.nextLong();
  long M = sc.nextLong();
  System.out.println(2*N > M ? M/2 : ((M-2*N)/4)+ N);
}}
