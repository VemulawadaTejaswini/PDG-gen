
import java.util.*;

public class Main
{
    private final static Main main = new Main();

    public static void main(String[] args)
    {
        main.contest();
    }

    private void contest()
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.substring(0, 4) + " " + s.substring(4));
    }
}
