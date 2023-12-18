import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> s = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        for (int i = 0;i<m;++i)
        {
            int ss = sc.nextInt();
            if (tmp.contains(ss))
            {
                System.out.println(-1);
                System.exit(0);
            }else s.add(ss);

            c.add(sc.nextInt());
        }

        String k[] = new String[n];

        for (int i = 0;i<n;++i) k[i] = "0";

        for (int i=0;i<m;++i) k[s.get(i)-1] = c.get(i).toString();

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;++i) sb.append(Integer.parseInt(k[i]));
        String sl = sb.toString();
        int value = Integer.parseInt(sl);

        if (n == String.valueOf(value).length()) System.out.println(value);
        else System.out.println(-1);
        sc.close();
    }
}