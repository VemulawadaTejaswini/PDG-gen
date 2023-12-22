import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int i;
  for(i = 1;i <= n;i++){
   for(int m=0;Math.pow(10,m) < i;m++){
    i= i/(Math.pow(10,m));
    if (i%3 == 0) {
     System.out.printf(" " + i);
    }else if(i%10 == 3){
     System.out.printf(" " + i);
    }else if(i > 10){
     int x = i;
    }
   }
  }
 System.out.println("");
 }
}