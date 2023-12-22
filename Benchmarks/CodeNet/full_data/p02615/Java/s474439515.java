import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> a = new ArrayList<>();
        for (int i = 0;i<n;++i) a.add(sc.nextLong());
        Collections.sort(a,Collections.reverseOrder());

        Map<Long,Integer> map = new TreeMap<>(new Comparator<Long>()
        {
            public int compare(Long k1,Long k2)
            {
                return k2.compareTo(k1);
            }
        });//値，個数（降順）

        boolean first = true;
        long tmp = Long.MIN_VALUE;
        int count = 0;
        for (long ae:a)
        {
            if (tmp != ae)
            {
                if (count == 1) ++count;
                else if (count % 2 == 0) count += 1;
                else count += 2;

                if (first && tmp != Long.MIN_VALUE)
                {
                    first = false;
                    //System.err.println("count = "+count+"("+tmp);
                    if (count == 2) count = 1;
                }

                map.put(tmp,count);
                count = 1;
                tmp = ae;
            }else
            {
                ++count;
            }
        }

        if (count == 1) ++count;
        else if (count % 2 == 0) count += 1;
        else count += 2;
        map.put(tmp,count);

        map.remove(Long.MIN_VALUE);

        //debug
        StringBuilder stb = new StringBuilder();
        for (Long key:map.keySet())
        {
            stb.append("("+key + "," + map.get(key)+")");
        }
        //System.err.println(stb.toString());
        //

        count = 0;
        long score = 0;
//        System.err.println(a.size());
        for (Long key:map.keySet())
        {
            if (count >= a.size()) break;
            int value = map.get(key);
            if (count + value > a.size() - 1) value = (a.size()-1) - count;
            score += (key * value);
            count += value;
            //System.err.println(count);
        }

        System.out.println(score);
        sc.close();
    }
}