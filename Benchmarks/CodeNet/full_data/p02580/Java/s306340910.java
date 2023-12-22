import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();

        int array[][] = new int[m][2];

        for (int i = 0; i < m; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }

        int arrayH[] = new int[h + 1];

        for (int i = 0; i < m; i++) {
            arrayH[array[i][0]]++;
        }

        int maxH = 0;

        for (int i = 0; i < h + 1; i++) {
            if (maxH < arrayH[i]){
                maxH = arrayH[i];
            }
        }

        int arrayW[] = new int[w + 1];

        for (int i = 0; i < m; i++) {
            arrayW[array[i][1]]++;
        }

        int maxW = 0;

        for (int i = 0; i < w + 1; i++) {
            if (maxW < arrayW[i]){
                maxW = arrayW[i];
            }
        }

        System.out.println(maxH + maxW - 1);


        sc.close();

        }

    }

