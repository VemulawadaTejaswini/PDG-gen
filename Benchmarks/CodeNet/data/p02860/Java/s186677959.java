import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = Integer.parseInt(sc.nextLine());
        String input2 = sc.nextLine();
        String result = "No";
        int K = input1/2;

        if (input1 % 2 == 0) {
            if (input2.substring(0, K).equals(input2.substring(K))) {
                result = "Yes";
            }
        }
        System.out.println(result);
    }

}
