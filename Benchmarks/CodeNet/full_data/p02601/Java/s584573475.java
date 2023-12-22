import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      int c = scan.nextInt();
      int k = scan.nextInt();
      int count = 0;
      while(a>=b){
        b= b*2;
        count++;
      }
      while(b>=c){
        c=c*2;
        count++;
      }
      if(count <= k){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
        
	}
}