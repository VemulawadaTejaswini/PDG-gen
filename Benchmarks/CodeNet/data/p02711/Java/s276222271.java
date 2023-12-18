import java.util.Scanner;

class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   Integer oi = new Integer(N);
	String str = oi.toString();

   if((str.contains("7")){
     System.out.println("Yes");
   }else{
     System.out.println("No");
   }
 
 }
}
