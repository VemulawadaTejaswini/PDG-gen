import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int n=kbd.nextInt();
   int d=kbd.nextInt();
   int num=0;
   for(int i=0;i<n;i++){
   long x=kbd.nextInt();
   long y=kbd.nextInt();
   if(Math.sqrt(x*x+y*y)<=d){
   num++;
 }
}
 System.out.println(num);
}
}
