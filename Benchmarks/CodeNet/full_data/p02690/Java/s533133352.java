import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int x=kbd.nextInt();
   int i=1;
     if(x%i==0){
       for(int a=0;a<=i;a++){
         for(int b=0;b<=a;b++){
         if((a-b)==i){
           cul(a,b,x);
         }
         if((b-a)==i){
           cul(b,a,x);
         }
         if((-a-b)==i){
           cul(-a,b,x);
         }
         if((a+b)==i){
           cul(a,-b,x);
         }
         }
       }
     }
   for(i=1;i<=x/2;i++){
     if(x%i==0){
       for(int a=0;a<i;a++){
         for(int b=0;b<=a;b++){
         if((a-b)==i){
           cul(a,b,x);
         }
         if((b-a)==i){
           cul(b,a,x);
         }
         if((-a-b)==i){
           cul(-a,b,x);
         }
         if((a+b)==i){
           cul(a,-b,x);
         }
         }
       }
     }
   }
}
  public static void cul(int n,int m,int x){
    if((n*n*n*n*n)-(m*m*m*m*m)==x){
      System.out.println(n+" "+m);
      System.exit(0);
    }
    }
}
