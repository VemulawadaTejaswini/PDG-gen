import java.util.Scanner;

class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int a = sc.nextint();
   int b = sc.nextint();
   int c = sc.nextint();
   int d = sc.nextint();
   boolean flag=false;
   
   for(int i=0;;i++){
   c=c-b;
   if(c<=0){
   flag=true;
   break;}
   a=a-d;
   if(a<=0){
   break;}
   }

   if(flag){
     System.out.println("Yes");
   }else{
     System.out.println("No");
   }
 
 }
}