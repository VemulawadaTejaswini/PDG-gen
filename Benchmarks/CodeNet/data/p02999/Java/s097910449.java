java.util.Scanner;

class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   round(sc);
 }
  
 public int round(int n){
   		if(n >= 0 || n <= 9){
        	System.out.println(0);
        }else if(n >= 10){
        	System.out.println(10);
        }
   }
}