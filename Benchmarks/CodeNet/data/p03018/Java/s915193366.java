import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	String s = sc.next();
      	int res = 0;
   		
      	while (s.indexOf("ABC") != -1) {
      		int index = s.indexOf("ABC");
      		if (index == 0) {
      			s = "BCA" + s.substring(3);
      		} else {
      			s = s.substring(0, index) + "BCA" + s.substring(index + 3);
      		}
  			
      		res++;
      	}
      	
      	System.out.println(res);
    }
}