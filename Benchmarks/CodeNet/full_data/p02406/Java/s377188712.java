import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int x=scan.nextInt();
boolean a=true;
for(int i=1; i<x+1; i++){
   if(i%3==0){
      System.out.print(" "+i);
      a=false;
   }
   int n=i; 
   while(a){
      if(n%10==3){
         System.out.print(" "+i);
         a=false;
      }else if(n>10){
         n =n/10;
      }else  a=false;
   }
   a=true;
}
System.out.println();
}
} 