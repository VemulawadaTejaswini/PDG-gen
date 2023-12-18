import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      
      if(x == 12 || y == 12){
        System.out.println("No");
      } else{
        if(x == 4 || x == 6 || x == 9 || x == 11){
          if(y == 4 || y == 6 || y == 9 || y == 11){
            System.out.println("Yes");
          }
          else{
            System.out.println("No");
          }
        }
        else{
          if(y == 4 || y == 6 || y == 9 || y == 11){
            System.out.println("No");
          }
          else{
            System.out.println("Yes");
          }
        }
      }
	}
}