
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        int[] values = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
            values[i] = -1;
        }
        int answer = calculate(count - 1, arr, values);
        System.out.println(answer);
    }

    private static int calculate(int answerPos, int[] arr, int[] values) {
        if (answerPos == 0) {
            return 0;
        }

        if (values[answerPos] != -1) {
            return values[answerPos];
        }
        int answer;
        int a = Math.abs(arr[answerPos] -  arr[answerPos - 1]) + calculate(answerPos - 1, arr, values);
        if (answerPos == 1) {
            answer = a;
        } else {
            int b =  Math.abs(arr[answerPos] - arr[answerPos - 2]) + calculate(answerPos - 2, arr, values);

            if (a > b) {
                answer = b;
            } else {
                answer = a;
            }
        }
        values[answerPos] = answer;
        return answer;
    }
}