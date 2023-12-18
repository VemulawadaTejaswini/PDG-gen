import javax.swing.text.Style;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        String str = sc.next();
        int n = sc.nextInt();

        for (int i = 0; i < str.length() - 1; i++)
            for (int j = i + 1; j < str.length() + 1; j++)
                if (!list.contains(str.substring(i, j)))
                    list.add(str.substring(i, j));

        String[] arr = list.toArray(new String[0]);
        Arrays.sort(arr);

        System.out.println(arr[n - 1]);
    }
}
