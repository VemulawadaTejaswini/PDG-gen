import java.util.*;
class Main{
    public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String check = scanner.nextLine();

        if (check.matches(input + "[a-z]")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
