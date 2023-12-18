import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Compute c1 = new Compute();//calc

        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //StringBuilder answer=new StringBuilder();
        long ans = 0;

        //input
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String s[]=new String[n];
        Map<List<String>,Long> map = new HashMap<>();
        for (int i=0;i<n;++i)
        {
            s[i]=sc.next();
            List<String> stringList = new ArrayList<>();
            for (int j=0;j<10;++j)
            {
                String ss=s[i].substring(j,j+1);
                stringList.add(ss);
            }

            Collections.sort(stringList);
            //System.out.println(Arrays.toString(stringList.toArray()));

            if (map.containsKey(stringList))
            {
                long a=map.get(stringList);
                ++a;
                //System.out.println(stringList);
                map.put(stringList,a);
            }else
            {
                //System.out.println(stringList);
                long a=1;
                map.put(stringList,a);
            }
        }

        for (List<String> list:map.keySet())
        {
            //System.out.println("key ="+Arrays.toString(list.toArray())+" value = "+map.get(list));
            long b=map.get(list);

            long c=0;
            while (true)
            {
                --b;
                if (b==0)break;
                c+=b;
            }
            ans+=c;
        }

        System.out.println(ans);
        //output
        //System.out.println(String.format("%.0f",answer));
    }
}