import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] antennaArr = new int[5];
        for (int i = 0; i < antennaArr.length; i++) {
            antennaArr[i] = sc.nextInt();
        }

        int border = sc.nextInt();

        boolean canConnect = true;
        for (int i = 0; i < antennaArr.length; i++) {
            for (int j = 0; j < antennaArr.length; j++) {
                if (i >= j) {
                    continue;
                }

                if (antennaArr[j] - antennaArr[i] > border) {
                    canConnect = false;
                }
            }
        }

        if (canConnect) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}
