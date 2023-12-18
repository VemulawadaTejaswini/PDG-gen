import java.util.Scanner;

class Main{
	public static void main(){
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      scan.close();
      
      if(a*b%2==1){
        System.out.println("Yes");
      }else{
      	System.out.println("No");
      }
    }
}