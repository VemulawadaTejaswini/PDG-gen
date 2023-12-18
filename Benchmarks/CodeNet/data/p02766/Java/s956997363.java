import java.util.Scanner;

class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   long N = sc.nextLong();
   int K = sc.nextInt();

   for(int i=0;;i++){
    if((Math.pow(K, i))>N){
    System.out.println(i);
      break;
    }
   }
 
 }
}
