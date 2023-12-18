import java.util.Scanner;

public class ClassSample {
	  public static void main(String args[]){
        
        Scannar scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        int count = 0;
        
        if(s.charAt(0) == "1")count++;
        if(s.charAt(1) == "1")count++;
        if(s.charAt(2) == "1")count++;
		
        System.out.println(count);
	 }
}