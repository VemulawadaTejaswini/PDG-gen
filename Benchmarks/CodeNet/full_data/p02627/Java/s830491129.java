import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
      
      if(Character.isUpperCase(line.charAt(0))){
      	System.out.println("A");
      }else{
      	System.out.println("a");
      }
    }
}