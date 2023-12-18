import java.util.Scanner;

class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   long x = sc.nextLong();
	long money=100;
  
   for(long i;i<10000000;i++ ){
     money=money*101/100;
     if(money>=x){
     break;
     }
   }
   
     System.out.println(i);
   
 
 }
}
