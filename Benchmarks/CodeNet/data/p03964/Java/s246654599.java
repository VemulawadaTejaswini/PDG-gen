import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] original = new int[2];
        int[] multiples = new int[2];
        int[] manipulate = new int[2];
        int t = sc.nextInt();
        original[0] = sc.nextInt();
        original[1] = sc.nextInt();
        int numvotes = original[0] + original[1];

        for (int i = 0; i < t - 1; i++) {
            manipulate[0] = sc.nextInt();
            manipulate[1] = sc.nextInt();
            if (manipulate[0] > original[0] && manipulate[1] > original[1]) {
                numvotes += (manipulate[1] - original[1]) + (manipulate[0] - original[0]);
                original[0] = manipulate[0];
                original[1] = manipulate[1];
                continue;
            }
            if (manipulate[0] == original[0] && manipulate[1] == original[1])
                continue;
            multiples[0] = manipulate[0];
            multiples[1] = manipulate[1];
            int n = 1;
            while (multiples[0] < original[0] || multiples[1] < original[1]) {

                multiples = multiply(manipulate, n);
                n++;
            }
            numvotes += (multiples[1] - original[1]) + (multiples[0] - original[0]);
            original[0] = multiples[0];
            original[1] = multiples[1];

        }
        System.out.println(numvotes);
    }
    public static int[] multiply(int[] input, int n) {
        int[] output = {input[0], input[1]};
        for (int i = 0; i < input.length; i++) {
            output[i] *= n;
        }
        return output;
    }

}
