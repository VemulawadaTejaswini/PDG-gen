import java.util.Scanner;

class Main {
  public static void main(String[] args){ 
  Scanner scan = new Scanner(System.in);
  String in = scan.nextLine();
   int a = Character.getNumericValue(in.charAt(0));
   int b = Character.getNumericValue(in.charAt(2));
   int c = Character.getNumericValue(in.charAt(4));
   int k = Character.getNumericValue(in.charAt(6));
   int out = 0;
   //+1
   for(int i = a; i > 0; i--){
   out+=1;
   
   }
   
   for(int i = k-a-b; i > 0; i--){
   out-=1;
   
   }
   System.out.println(out);
  }


}