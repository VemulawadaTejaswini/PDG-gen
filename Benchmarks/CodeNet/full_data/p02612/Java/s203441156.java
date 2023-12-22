public class Main{
 public static void main(String[] args){
  int sum = new java.util.Scanner(System.in).nextInt();
  int i = 1;
 
  while(true){
   int pay = 1000 * i;
   if(pay > sum){
    int oturi = pay - sum;
    System.out.println(oturi);
    break;
   }else{
    i++;
   }
  }
 }
}