
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
        String orig = "CODEFESTIVAL2016";
        String s = sc.nextLine();
        int res = 0;
        for(int i=0; i<s.length(); ++i)
        {
            res += s.charAt(i) != orig.charAt(i) ? 1 : 0;
        }
        System.out.println(res);
    }
}
