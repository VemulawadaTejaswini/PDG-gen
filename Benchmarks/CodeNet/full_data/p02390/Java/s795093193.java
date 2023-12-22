import java.util.Scanner;
class Main {
 public static void main(String[] args){
 
  Scanner scan = new Scanner(System.in);
  
  int x= scan.nextInt(),h=x/3600,m,s;
  x%=3600;
  m=x/60;
  x%=60; 
  s=x;
 
  System.out.println(h+":"+m+":"+s);
 }
}