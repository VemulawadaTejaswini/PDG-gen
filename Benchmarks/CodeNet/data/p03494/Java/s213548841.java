import java.util.Scanner;

public class Main
{
    // https://atcoder.jp/contests/abc081/tasks/abc081_b
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(calculate(numbers));
    }

    public static int calculate(int[] numbers)
    {
        int answer = 0;
        while(divide(numbers)) {
            answer++;
        }
        return answer;
    }

    private static boolean divide(int[] numbers)
    {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                return false;
            }
            numbers[i] /= 2;
        }
        return true;
    }
}
