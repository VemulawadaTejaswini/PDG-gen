import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.equals("A")){
            System.out.println("T");
        } else if(str.equals("T")){
            System.out.println("A");
        } else if(str.equals("G")){
            System.out.println("C");
        } else if(str.equals("C")){
            System.out.println("G");
        }
    }
}
