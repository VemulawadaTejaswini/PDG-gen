import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
   int sum=0;
   sum+=sc.nextInt();
   sum+=sc.nextInt()*5;
   sum+=sc.nextInt()*10;
   sum+=sc.nextInt()*50;
   sum+=sc.nextInt()*100;
   sum+=sc.nextInt()*500;
   if(sum>=1000)System.out.println(1);
   else System.out.println(0);
		  
         }
  }