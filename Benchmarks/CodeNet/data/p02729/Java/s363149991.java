import java.util.Scanner; 

class Main{

 public static void main(String[] args){

 Scanner scan = new Scanner(System.in);

 int n = scan.nextInt();
 int m = scan.nextInt();
   
   if (n >= 2 || m >=2 ){
     int a = n*(n-1)/2;
     int b = m*(m-1)/2;
     
      System.out.println(a+b);
   }
   else {
     System.out.println(0);
   }
 }
}