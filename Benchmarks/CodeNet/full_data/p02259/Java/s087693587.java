import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        int[] inputs = input();
//        int[] inputs = mockup();
        int swapCount = 0;

        for (int i = 0; i < inputs.length; i++) {
            for (int j = inputs.length - 1; j > i; j--) {
                if (inputs[j] < inputs[j-1]) {
                    swap(inputs, j, j-1);
                    swapCount++;
                }
            }
        }
        StringBuilder output = new StringBuilder();
        for (int i : inputs) {
            output.append(i + " ");
        }
        String outputString = output.toString();
        System.out.println(outputString.substring(0,outputString.length() - 1));
        System.out.println(swapCount);
    }

    private static int[] mockup() {
        int a[] = {1,2,3,4,5};
        return a;
    }

    private static void swap(int[] inputs, int j, int i) {
        int a = inputs[j];
        int b = inputs[i];
        inputs[i] = a;
        inputs[j] = b;
    }


    public static int[] input() {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] inputs = new int[count];
        for (int i = 0; i < count; i++) {
            inputs[i] = in.nextInt();
        }
        in.close();
        return inputs;
    }

}