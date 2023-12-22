import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by martin-d28jp-love on 15/04/01.
 */
public class Main {

    public static void main(String[] args) {
        int[] input = input();
//        int[] input = mockuop();

        int inputLength = input.length;
        int minValue = Integer.MAX_VALUE;
        int maxValue = -Integer.MAX_VALUE;
        int minIndex = 0;
        int maxIndex = 0;
        for (int i=0; i < inputLength; i++) {
            int Ri = input[i];
            if (Ri < minValue) {
                minValue = Ri;
                minIndex = i;
            }
            if (Ri > maxValue) {
                maxValue = Ri;
                maxIndex = i;
            }
        }
        if (minIndex < maxIndex) {
            System.out.println(maxValue - minValue);
            return;
        }

        int maxSubtruction = -Integer.MAX_VALUE;
        int maxSubtructionIndex = 0;
        int beforeSubtructionRi = Integer.MAX_VALUE;
        for (int i = 0; i < inputLength - 1; i++) {
            int Ri = input[i];
            if (beforeSubtructionRi < Ri) {
                continue;
            }
            int start = maxSubtructionIndex > i + 1 ? maxSubtructionIndex : i + 1;
            for (int j = start; j < inputLength; j++) {
                int Rj = input[j];
                if (Rj - Ri > maxSubtruction) {
                    maxSubtruction = Rj - Ri;
                    maxSubtructionIndex = j;
                    beforeSubtructionRi = Ri;
                }
            }
        }
        System.out.println(maxSubtruction);
    }

    public static int[] mockuop() {
        int input[] = {20,100,99,95,86,85,76,75,71,70,61,52,48,47,43,42,38,37,33,32,28};
        return input;
    }

    public static int[] input() {
        Scanner in = new Scanner(System.in);
        int size = Integer.valueOf(in.nextLine());

        int[] input = new int[size];
        int i = 0;
        while(in.hasNext()) {
            input[i++] = Integer.valueOf(in.nextLine());
        }
        in.close();
        return input;
    }
}