import java.util.Scanner;
class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   long x = sc.nextLong();
	long money=100;
   for(int i=1;;i++ ){
     money*=1.01;
     if(money>=x){
       System.out.println(i);
     break;
     }
   }
 }
}
