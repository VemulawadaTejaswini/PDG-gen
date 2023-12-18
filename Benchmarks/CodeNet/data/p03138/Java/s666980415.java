import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // get a integer
        int a = sc.nextInt();
        // get two integers separated with half-width break
        int b = sc.nextInt();

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[a];

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = input.nextInt();
        }
        System.out.println(findMaximumValue(numbers, b));
    }

    static int findMaximumValue(int x[], int k) {
        int max = 0;
        int check = 0;
        int start = 0;
        while (start < k) {
            for (int i = 0; i < x.length; i++) {
                check = check + ((x[i] | start) & (~x[i] | ~start));

            }
            start++;
            if (check >= max) {
                max = check;
            }
            check = 0;
        }
        return max;
    }

}