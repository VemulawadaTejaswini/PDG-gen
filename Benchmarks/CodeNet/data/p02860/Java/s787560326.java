import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input11 = sc.nextLine();
        int input1 = Integer.parseInt(input11);
        String input2 = sc.nextLine();

        if ((input2.length())%2 == 0 && input2.substring(0, input1/2-1).equals(input2.substring(input1/2, input1-1))) {
                System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
