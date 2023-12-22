import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] a){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] inputs = new int[3];

        String result;
        for(int i = 0;i < n;i++) {
            for (int j = 0; j < 3; j++) {
                int m = s.nextInt();
                inputs[j] = m * m;
            }
            Arrays.sort(inputs);
            result = inputs[0] + inputs[1] == inputs[2] ? "YES" : "NO";

            System.out.println(result);
        }
    }
}