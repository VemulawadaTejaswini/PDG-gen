import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input11 = sc.nextLine();
        String input2 = sc.nextLine();
        int input1 = Integer.parseInt(input11);

        if (input2.length()!=1 && input1 == input2.length() && input2.substring(0, input1/2-1).equals(input2.substring(input1/2, input1-1))) {
                System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
