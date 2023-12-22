import java.util.Scanner;
import volume0.BaseExe;

public class Work extends BaseExe {

    public static void main(String[] args) {
        new Work().exeSysIn();
    }

    @Override
    protected void execute(Scanner scan) {
        int[] num = new int[51];
        for (int a = 0; a <= 9; a++)
            for (int b = 0; b <= 9; b++)
                for (int c = 0; c <= 9; c++)
                    for (int d = 0; d <= 9; d++)
                        num[a + b + c + d]++;
        String ln = "";
        while (scan.hasNextLine() && !"".equals(ln = scan.nextLine()))
            System.out.println(num[Integer.parseInt(ln)]);
    }

}