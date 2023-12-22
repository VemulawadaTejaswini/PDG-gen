import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;
import static java.lang.System.out;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        new Main().right();
    }

    public void right() {
        try (Scanner scan = new Scanner(System.in)) {
            scanInData(scan);
        } catch (Exception e) {
            System.exit(0);
        }
    }

    public void right(String inDataPath) {
        try (Scanner scan = new Scanner(new File(inDataPath))) {
            scanInData(scan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void scanInData(Scanner scan) {
        int dataCount = parseInt(scan.nextLine());
        for (int i = 0; i < dataCount; i++) {
            String[] data = scan.nextLine().split(" ");
            printJudgeTriangle(parseInt(data[0]), parseInt(data[1]), parseInt(data[2]));
        }
    }

    public void printJudgeTriangle(int a, int b, int c) {
        if (judgeTriangle(a, b, c) || judgeTriangle(b, c, a) || judgeTriangle(c, a, b)) {
            out.println("YES");
        } else {
            out.println("NO");
        }
    }

    public boolean judgeTriangle(int x, int y, int z) {
        return pow(x, 2) + pow(y, 2) == pow(z, 2);
    }
}