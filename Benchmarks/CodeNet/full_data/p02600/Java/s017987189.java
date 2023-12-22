import java.util.*;
 
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int x = sc.nextInt();
   int grade = 0;
   
   if(x >= 400 && x <= 599){
    grade = 8;
   }else if(x >= 600 && x <= 799){
    grade = 7;
   }else if(x >= 800 && x <= 999){
    grade = 6;
   }else if(x >= 1000 && x <= 1199){
    grade = 5;
   }else if(x >= 1200 && x <= 1399){
    grade = 4;
   }else if(x >= 1400 && x <= 1599){
    grade =3;
   }else if(x >= 1600 && x <= 1799){
    grade = 2;
   }else if(x >= 1800 && x <= 1999){
   grade = 1;
   }
   
   System.out.println(grade);  
   
   
  }
 }