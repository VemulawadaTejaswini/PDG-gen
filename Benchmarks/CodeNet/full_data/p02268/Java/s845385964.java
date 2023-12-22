import javax.sound.midi.Soundbank;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //探索対象を取得
        int size = (scanner.nextInt());
        int [] S= new int[size];
        for (int i = 0; i < size; i++) {
            S[i] = scanner.nextInt();
        }

        //探索する値を取得
        int ansSize = (scanner.nextInt());
        int[] T = new int[ansSize];
        for (int i = 0; i < ansSize; i++) {
            T[i] = scanner.nextInt();
        }

        double roopCount = 0;
        int count = 0;
        //探索用のアルゴリズム
        for (int i = 0; i < ansSize; i++) {
            int left = 0;
            int right = size-1;
            int mid = (size-1)/2;
            while (S[left] < S[right]) {
                mid = (right+left)/2;
                if (S[mid] > T[i]) {
                    right = mid;
                }else if (S[mid]<T[i]){
                    left = mid;
                }else if (T[i]==S[mid]) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
