
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, C;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        if (A + C == B) {
            System.out.println("yes");
        } // System.out.printf("Give the pack with %d candies to one student, and give the two packs with %d and %d candies to the other. Then, each gets %d candies.\n", B, A, C,B);
        else if (A == C + B || C == A + B) {
            System.out.println("yes");
        } else {
            System.out.println("No");
            // System.out.println("In this case, the student who gets the pack with 100 candies always has more candies than the other.\nNote that every pack must be given to one of them");
        }

    }
}