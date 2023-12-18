import java.util.*;

public class Main {
    public static void main (String[]args){
        
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        String s = scanner.nextLine();

        if (a < 3200){
          System.out.println("red");
        } else{
          System.out.println(s);
        } 
                
        scanner.close();

    }
} 