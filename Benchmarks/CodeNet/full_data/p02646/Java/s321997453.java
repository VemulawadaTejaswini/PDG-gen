import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   long a=kbd.nextLong();
   long v=kbd.nextLong();
   long b=kbd.nextLong();
   long w=kbd.nextLong();
   long t=kbd.nextLong();
   long A=a+v*t;
   long B=b+w*t;
   long C=a-v*t;
   long D=b-w*t;
   if(a<=b){
   if(A>=B){
      System.out.println("YES");
   }else{
      System.out.println("NO");
   }
 }
 if(a>b){
   if(C<=D){
   System.out.println("YES");
}else{
  System.out.println("NO");
}
 }
}
}