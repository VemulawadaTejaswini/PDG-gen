import java.util.* ; 
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
	int n = scan.nextInt();
	if(n<1200){
      System.out.println("ABC");
    }else if(n<2800){
      System.out.println("ARC");
    }else{
      System.out.println("AGC");
    }
  }
}
