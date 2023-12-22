import java.util.*;
class Main{
    public static void main(String args[]){
        String input = args[0];
        String check = args[1];

        if (check.matches(input + "[a-z]")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}