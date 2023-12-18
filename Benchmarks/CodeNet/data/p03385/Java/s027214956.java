import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        char[] answer = {'a', 'b', 'c'};
        char[] split = s.toCharArray();
        Arrays.sort(split);

        if (Arrays.equals(split, answer)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
