import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int n=kbd.nextInt();
   int a=kbd.nextInt();
   int b=kbd.nextInt();

   if(a==0){
     System.out.println(a);
   }else if(b==0){
     System.out.println(n);
   }else{
   int k=a+b;
   int x;
   if(n%k>a){
     x=a;
   }else{
     x=n%k;
   }
   System.out.println(n/k*a+x);
 }
}
}