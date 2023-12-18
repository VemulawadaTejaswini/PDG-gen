import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if(input.length() == 2){
            System.out.println(input);
        }else{
            String first = input.substring(0,1);
            String second = input.substring(1,2);
            String third = input.substring(2,3);
            System.out.println(third + second + first);
        }
        
    }
}
