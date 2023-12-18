import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] inputs = new int[N];
        for (int i = 0; i < N; i++) inputs[i] = sc.nextInt();

        int left = 0;
        int right = N - 1;
        int sum = 0;
        while (left <= right) {
            int max = -1;
            int index = -1;
            boolean isLeft = false;
            for (int i = 0; i < inputs.length; i++) {
                if (inputs[i] == 0) continue;
                int maxCur = Math.max(Math.abs(i - left), Math.abs(i - right)) * inputs[i];
                if (maxCur > max) {
                    max = maxCur;
                    index = i;
                    isLeft = Math.abs(i - left) > Math.abs(i - right);
                }
            }
            sum += max;
            inputs[index] = 0;
            if (isLeft) left++;
            else right--;
        }
        System.out.println(sum);
    }
}
