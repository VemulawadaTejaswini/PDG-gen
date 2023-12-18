import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   long n =kbd.nextLong();
   long k =kbd.nextLong();
   long x=0;
   long y=0;
   if(n%k==0){
     x=0;
   }else if(n>=k){
   y=n/k;
   int p=k*y-n;
   x=k-p;
 }else{
    x=n;
 }
  System.out.println(x);
}
 }
