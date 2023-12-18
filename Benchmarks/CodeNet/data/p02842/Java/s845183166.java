
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Double n = scanner.nextDouble();
	
   	Double x = Math.floor(n / 1.08);
    
    if((n)==(x*1.08)){
    	System.out.println(x.intValue());
    }else{
      	System.out.println(":(");
    }
    
    scanner.close();

  }

}