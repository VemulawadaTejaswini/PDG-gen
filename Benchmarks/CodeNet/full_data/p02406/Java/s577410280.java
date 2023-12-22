import java.util.Scanner;
public class Main {
 private static Scanner sc;
 public static void main(String[] args){
  int i,x;
  sc = new Scanner(System.in);
  int n = sc.nextInt();
   for(i=3;i<=n;i++){
	   x=i;
	   if(n<3||n>10000){
		   break;
	   }
       if(x%3==0){
    	     System.out.print(" "+i);
       }else if(x%10==3){
    	     System.out.print(" "+i);
       }
       x/=10;
       if(x==3 && x%10!=3){
    	   System.out.print(" "+i);
       }
   }
   System.out.println();
 }
}