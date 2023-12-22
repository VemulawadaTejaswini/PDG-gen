import java.util.Scanner;
public class Main {
 private static Scanner sc;
 public static void main(String[] args){
  int i=3;
  sc = new Scanner(System.in);
  int n = sc.nextInt();
  while(true){
	   if(n<3||n>10000){
		   break;
	   }
	   if(i>n){
		   break;
	   }
       if(i%3==0){
    	     System.out.print(" "+i);
       }else if(i%10==3){
    	      System.out.print(" "+i);
       }
       i++;
   }
   System.out.println();
 }
}