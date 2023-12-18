import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] NN = new int[N];
        int max = 0;
        int sum = 0;
        for (int i = 0; i < NN.length; i++) {
            NN[i] = sc.nextInt();
        }
        for (int i = 0; i < NN.length; i++) {
            if (NN[i] > max) {
                max = NN[i];
            }else{
            }
        }
        for (int i = 0; i < NN.length; i++) {
            sum += NN[i];
        }
        System.out.println(sum - max / 2);

    }

}