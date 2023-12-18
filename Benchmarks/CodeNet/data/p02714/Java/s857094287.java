import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final String[] s = new String[n + 1];
        s[0] = "NULL";
        String ss = sc.next();

        Map<Integer,Integer> rMap = new HashMap<>();
        Map<Integer,Integer> gMap = new HashMap<>();
        Map<Integer,Integer> bMap = new HashMap<>();

        int []rArray = new int[n+1];
        int []gArray = new int[n+1];
        int []bArray = new int[n+1];
        rArray[0] = 0;
        gArray[0] = 0;
        bArray[0] = 0;
        int rCon = 0;
        int gCon = 0;
        int bCon = 0;

        for (int i = 1; i < s.length; ++i)
        {
            s[i] = ss.substring(i - 1, i);

            if (s[i].equals("R"))
            {
                rMap.put(i,1);
                ++rCon;
            }
            if (s[i].equals("G"))
            {
                gMap.put(i,1);
                ++gCon;
            }
            if (s[i].equals("B"))
            {
                bMap.put(i,1);
                ++bCon;
            }

            rArray[i] = rCon;
            gArray[i] = gCon;
            bArray[i] = bCon;
        }

        int count = 0;
        for (int k = n;k>0;--k)
        {
            for (int j = k-1;j>0;--j)
            {
                if (s[k].equals(s[j])) continue;

                String target = "";
                if (!s[k].equals("R") && !s[j].equals("R")) target = "R";
                else if (!s[k].equals("G") && !s[j].equals("G")) target = "G";
                else if (!s[k].equals("B") && !s[j].equals("B")) target = "B";

                int ind = j-1;
                int num = 0;
                if (target.equals("R")) num = rArray[ind];
                else if (target.equals("G")) num = gArray[ind];
                else if (target.equals("B")) num = bArray[ind];

                int tmp = 2*j-k;
                if (tmp <= ind)
                {
                    if (target.equals("R") && rMap.get(tmp) == 1) --num;
                    if (target.equals("G") && gMap.get(tmp) == 1) --num;
                    if (target.equals("B") && bMap.get(tmp) == 1) --num;
                }

                count += num;
            }
        }
        System.out.println(count);
        sc.close();
    }
}