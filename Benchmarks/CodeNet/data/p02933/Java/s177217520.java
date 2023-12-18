import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String str = in.next();
        if (num <= 3200 ){
            str = "red";
        }
        System.out.println(str);

        
    }
}
