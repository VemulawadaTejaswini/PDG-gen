import java.util.Scanner;

public class Main {
 public static void main (String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int a = sc.nextInt();
  int b = sc.nextInt();
   if(n==0 || a>b){
    System.out.print(0);
   }else if(a<b && n==1){
    System.out.print(0);
   }else if(a==b && n!=1){
    System.out.print(0);
   }else if(a==b && n==1){
    System.out.print(1);
   }else if(n==2){
    System.out.print(1);
   }
  int k = n-2;
  int j = b-a-1;
  int s = j+2;
  for (int i = 0; i < s; i++ ) {
   int r += (s-i);
  }
  int ret = r*k;
 }
}