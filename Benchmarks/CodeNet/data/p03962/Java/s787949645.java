import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
  Scanner sc = new Scanner(System.in);
 
  public static void main(String[] args) {
    new Main().run();
  }


  void run() {
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c=sc.nextInt();
   int result=0;
   if(a==b&&a==c){
	   result=1;
   }else if(a==b&&a!=c){
	   result=2;
   }else if(a==c&&a!=b){
	   result=2;
   }else if(b==c&&a!=b){
	   result=2;
   }else {
	   result=3;
   }
   System.out.println(result);
   
  }
 

 
  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}