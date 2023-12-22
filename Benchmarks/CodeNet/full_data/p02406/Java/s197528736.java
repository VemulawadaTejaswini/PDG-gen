import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  
  Scanner num = new Scanner(System.in);
  int n = num.nextInt();
  int i=1;
  
  while(true){
 
   int x=i;
   if(x%3 == 0) 
    System.out.printf("%d ",i);
   if(x > 10){
    if(x%10 == 3){
     System.out.printf("%d ",x);
    }
   }
   i++;
   if(i > n) break;
  }
  
  System.out.println();
 }
}