import static java.lang.System.out;
import static java.lang.Long.parseLong;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().printGCDLCM();
    }

    public void printGCDLCM() {
        try (Scanner scan = new Scanner(System.in)) {
            gcdLCM(scan);
        } catch (Exception e) {
            System.exit(0);
        }
    }

    public void printGCDLCM(String inputDataPath) {
        try (Scanner scan = new Scanner(new File(inputDataPath))) {
            gcdLCM(scan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void gcdLCM(Scanner scan) {
        String inputData;
        while ((inputData = scan.nextLine()) != null && !"".equals(inputData)) {
            long[] data = getData(inputData);
            out.println(gcd(data) + " " + lcm(data));
        }
    }

    private long[] getData(String inputData) {
        String[] dataSplit = inputData.split(" ");
        long[] data = { parseLong(dataSplit[0]), parseLong(dataSplit[1]) };
        return data;
    }

    private long lcm(long[] data) {
        return (data[0] * data[1]) / gcd(data);
    }

    private long gcd(long[] data) {
        long[] tmpData = changeAB(data).clone();
        long mod = -1;
        while ((mod = tmpData[0] % tmpData[1]) != 0) {
            tmpData[0] = tmpData[1];
            tmpData[1] = mod;
        }
        return tmpData[1];
    }

    private long[] changeAB(long[] data) {
        if (data[0] < data[1]) {
            long tmp = data[0];
            data[0] = data[1];
            data[1] = tmp;
        }
        return data;
    }
}