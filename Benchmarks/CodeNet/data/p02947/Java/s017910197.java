import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int N;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());

        int[][] strData = new int[N][26];

        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            strData[i] = count(s, strData[i]);
        }

        int anagramCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (Arrays.equals(strData[i], strData[j])) anagramCount++;
            }
        }
        System.out.println(anagramCount);
    }

    public static int[] count(String s, int[] array) {
        for (int i = 0; i < 10; i++) {
            switch (s.charAt(i)) {
                case 'a':
                    array[0]++;
                    break;
                case 'b':
                    array[1]++;
                    break;
                case 'c':
                    array[2]++;
                    break;
                case 'd':
                    array[3]++;
                    break;
                case 'e':
                    array[4]++;
                    break;
                case 'f':
                    array[5]++;
                    break;
                case 'g':
                    array[6]++;
                    break;
                case 'h':
                    array[7]++;
                    break;
                case 'i':
                    array[8]++;
                    break;
                case 'j':
                    array[9]++;
                    break;
                case 'k':
                    array[10]++;
                    break;
                case 'l':
                    array[11]++;
                    break;
                case 'm':
                    array[12]++;
                    break;
                case 'n':
                    array[13]++;
                    break;
                case 'o':
                    array[14]++;
                    break;
                case 'p':
                    array[15]++;
                    break;
                case 'q':
                    array[16]++;
                    break;
                case 'r':
                    array[17]++;
                    break;
                case 's':
                    array[18]++;
                    break;
                case 't':
                    array[19]++;
                    break;
                case 'u':
                    array[20]++;
                    break;
                case 'v':
                    array[21]++;
                    break;
                case 'w':
                    array[22]++;
                    break;
                case 'x':
                    array[23]++;
                    break;
                case 'y':
                    array[24]++;
                    break;
                case 'z':
                    array[25]++;
                    break;
            }
        }
        return array;
    }
}
