import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	String rain = sc.next();
      
      	if (rain.contains("R")) {
          System.out.println(1);
        } else if(rain.contains("RR")) {
		  System.out.println(2);
        } else if(rain.contains("RRR")) {
	      System.out.println(3);
        } else {
          System.out.println(0);
        }
		sc.close();
	}
 
}