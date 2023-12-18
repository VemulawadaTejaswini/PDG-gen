import java.util.Scanner;

/**
 * Created by donamphuong on 25/09/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numStudents = input.nextInt();
        int A = input.nextInt();
        int B = input.nextInt();
        String students = input.next();

        int passed = 0;
        int oversea = 0;

        for(int i = 0; i < numStudents; i++) {
            char c = students.charAt(i);
            String answer = "No";

            if(c == 'b') {
                oversea += 1;
            }

            if((c == 'a' && passed < A+B)
                || (c == 'b' && passed < A+B && oversea<=B)) {
                answer = "Yes";
                passed++;
            }

            System.out.println(answer);
        }
    }
}
