import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            String str = sc.next();
            if(str.equals("-"))return;
            int m = sc.nextInt();
            List<Integer> hList = new ArrayList<>();
            for(int i=0;i<m;i++)
            {
                hList.add(sc.nextInt());
            }
            for (int h:hList)
            {
                String str1 = str.substring(0,h);
                String str2 = str.substring(h);
                str = str2 + str1;
            }
            System.out.println(str);
        }
    }
}