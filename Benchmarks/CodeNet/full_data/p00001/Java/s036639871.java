import java.util.Arrays;

public class Vol_0_001 {

    public static void main(String[] args) {

        int[] mountArray = {100, 200, 900, 400, 500, 600, 700, 800, 900, 300};

        Arrays.sort(mountArray);

        for (int i = 9; i > 6; i--) {
            System.out.println(mountArray[i]);
        }

    }

}