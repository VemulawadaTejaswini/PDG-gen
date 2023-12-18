
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int answer = solve(a, b, c);
        System.out.println(answer);
    }

    private static int solve(int a, int b, int c) {
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        int max = Arrays.stream(array).max().getAsInt();
        List<Integer> list = new ArrayList(Arrays.asList(a,b,c));
        int index = list.indexOf(max);
        int count = 0;
        for (; ; ) {
            count++;
            array[(index + 1) % 3]++;
            array[(index + 2) % 3]++;
            if (array[index] == array[(index + 1) % 3]) {
                int degree = array[index] - array[(index + 2) % 3];
                count += degree / 2;
                if (degree % 2 == 1) {
                    count += 2;
                }
                return count;
            }
            if (array[index] == array[(index + 2) % 3]) {
                int degree = array[index] - array[(index + 1) % 3];
                count += degree / 2;
                if (degree % 2 == 1) {
                    count += 2;
                }
                return count;
            }
        }
    }


}
