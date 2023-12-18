import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int [] input = new int[size];
        for (int i = 0; i < size; ++i) {
            input[i] = sc.nextInt();
        }

        int mediaIndex = (size / 2) - 1;

        int[] filtered = new int[size - 1];
        for (int i = 0; i < size; ++i) {
            int a = 0;
            for (int j = 0; j < size; ++j) {
                if (i == j) continue;
                filtered[a] = input[j];
                ++a;
            }
            Arrays.sort(filtered); // [mediaIndex];
            System.out.println(filtered[mediaIndex]);
        }
    }
}
