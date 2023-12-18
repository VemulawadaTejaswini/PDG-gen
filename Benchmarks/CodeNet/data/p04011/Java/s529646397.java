import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
    execute();
    }

    private static void execute() throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        System.out.println(calcHotelFee(n, k, x, y));
    }

    public static int calcHotelFee(int stayNum, int feeChangeDays, int feeX, int feeY) {
        if (stayNum <= feeChangeDays) {
            return stayNum * feeX;
        }
        return feeChangeDays * feeX + (stayNum - feeChangeDays) * feeY;
    }
}