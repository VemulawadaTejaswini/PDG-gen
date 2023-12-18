
import java.util.Scanner;

public class Main
{
    private final static Main main = new Main();

    public static void main(String[] args)
    {
        long l = System.currentTimeMillis();
        main.contest();
        //System.out.println("処理時間：" + (System.currentTimeMillis() - l));
    }

    private void contest()
    {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        while(x.contains("ST")) x = x.replace("ST", "");
        System.out.println(x);
    }
}
