import static java.lang.System.out;
import static java.lang.Integer.parseInt;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().digit();
    }

    public void digit() {
        try (Scanner scan = new Scanner(System.in)) {
            scanDigit(scan);
        } catch (Exception e) {
            System.exit(0);
        }
    }

    public void digit(String inDataPath) {
        try (Scanner scan = new Scanner(new File(inDataPath))) {
            scanDigit(scan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void scanDigit(Scanner scan) throws Exception {
        String inData;
        while ((inData = scan.nextLine()) != null || !"".equals(inData)) {
            String[] inDataList = inData.split(" ");
            int sum = parseInt(inDataList[0]) + parseInt(inDataList[1]);
            out.println(String.valueOf(sum).length());
        }
    }
}