import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    private static int MOD = 1000000007;


    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int n = readInteger(br);

        int ichi = n % 10;

        if(ichi == 3){
            System.out.println("bon");
            return;
        }

        switch (ichi) {
            case 0:
            case 1:
            case 6:
            case 8:
                System.out.println("pon");
                return;
            default:
                System.out.println("hon");
        }

    }


    private static int readInteger(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }

    private static int[] readIntegers(BufferedReader br) throws IOException {
        String[] s = br.readLine().split(" ");
        int[] ret = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            ret[i] = Integer.parseInt(s[i]);
        }
        return ret;
    }

}
