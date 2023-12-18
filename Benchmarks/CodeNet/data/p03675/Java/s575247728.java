import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++)
            a[i] = sc.nextInt();
        List<Integer> odd = new LinkedList<>();
        List<Integer> even = new LinkedList<>();

        for(int i = 0;i < n;i += 2) {
            odd.add(a[i]);
            if(i+1 <= n - 1)
                even.add(a[i+1]);
        }
        if(n % 2 == 0)
        {
            Collections.reverse(even);
            even.addAll(odd);
            List<Integer> ls = even;
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i < ls.size() - 1;i++)
                sb.append(ls.get(i) + " ");
            sb.append(ls.get(ls.size() - 1));
            System.out.println(sb.toString());
        }
        else
        {
            Collections.reverse(odd);
            odd.addAll(even);
            List<Integer> ls = odd;
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i < ls.size() - 1;i++)
                sb.append(ls.get(i) + " ");
            sb.append(ls.get(ls.size() - 1));
            System.out.println(sb.toString());
        }

    }

}
