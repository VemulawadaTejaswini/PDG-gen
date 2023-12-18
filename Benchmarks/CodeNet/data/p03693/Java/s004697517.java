import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      String tokens[] = scanner.nextLine().split(" ");
      
      int g = Integer.parseInt(tokens[1]);
      int b = Integer.parseInt(tokens[2]);
      
      if((10*g+b)%4 == 0){
        System.out.println("YES");
      }
      else{
        System.out.println("NO");
      }
      
      
    }
}