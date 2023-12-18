import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        float sum = 0;
        int[] numarray = new int[a];
        float[] resultarray = new float[a];
        for (int i = 0; i < a; i++) {
            numarray[i] = sc.nextInt();
        }
        for (int i = 0; i < numarray.length; i++) {
            resultarray[i] = (float) 1 / numarray[i];
        }
        for (int j = 0; j < resultarray.length; j++) {
            sum = sum + resultarray[j];
        }
        sum = 1 / sum;

        System.out.println(sum);
    }
}
