import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String line2 = sc.nextLine();
        
        if(line2.equals(line + "s")){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }

    }
}