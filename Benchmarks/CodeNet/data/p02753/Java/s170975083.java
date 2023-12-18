import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception{
        
      Scanner s = new Scanner(System.in);
        String input = s.nextLine();
      	System.out.println(input);
      
      if (input.length() != 3){
      	System.exit(-1);
      }
      
      String first = String.valueOf(input.charAt(0));
      for (int i = 0; i < input.length(); i++){
        String _data = String.valueOf(input.charAt(i));
      	if (!first.equals(_data)){
        	System.out.println(first+" != "+_data);
        	System.out.println("Yes");
          	System.exit(0);
        }
      }
        	System.out.println("No");
    }
}