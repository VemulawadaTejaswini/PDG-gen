import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int n = sc.nextInt();
            int r =sc.nextInt();
            if(n==0&&r==0)return;
            List<Integer> data = new ArrayList<>();
            IntStream.rangeClosed(1, n).forEach(i -> data.add(i));
            for(int i=0;i<r;i++)
            {
                int p = sc.nextInt();
                int c = sc.nextInt();
                int from = n - p - c+1;
                int to = from + c;
                List<Integer> range = new ArrayList<>();
                range.addAll(data.subList(from,to));
                for(int f=0;f<c;f++)data.remove(from);
                data.addAll(range);
            }
            System.out.println(data.get(n-1));
        }
    }
}