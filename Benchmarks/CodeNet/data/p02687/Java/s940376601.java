import java.util.Scanner;

public class Main{
	public static void main(String[]org){
    	
      Scanner scan = new Scanner(System.in);
      String s = scan.nextLine();
      String result = "";
      if(s.charAt(1)=='B'){
		result = "ARC";
      }
      else{
        result ="ABC";
      }
     System.out.println(result);
	}
}
