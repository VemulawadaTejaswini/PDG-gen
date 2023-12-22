
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int[] r = new int[i];
        for (int j = 0; j < i; j++) {
            r[j] = in.nextInt();
        }
        int maxNum = -1000000000;
        int minNum = r[0];
        for (int k = 1; k < i; k++) {
            maxNum = (maxNum > (r[k]-minNum))? maxNum:(r[k]-minNum);
            minNum = minNum < r[k] ?minNum:r[k];
        }
        System.out.println(maxNum);

    }
}

