import java.util.Scanner;

public class GCDandLCM {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputData;
        while ((inputData = scan.nextLine()) != null || !"".equals(inputData)) {
            String[] inputDataSP = inputData.split(" ");
            long a = Long.parseLong(inputDataSP[0]);
            long b = Long.parseLong(inputDataSP[1]);
            long gcd = gcd(a, b);
            long lcm = (a * b) / gcd;
            System.out.println(gcd + " " + lcm);
        }
        scan.close();
    }

    private static long gcd(long a, long b) {
        a = (a < b) ? b : a;
        b = (a < b) ? a : b;
        long mod = -1;
        while ((mod = a % b) != 0) {
            a = b;
            b = mod;
        }
        return b;
    }
}