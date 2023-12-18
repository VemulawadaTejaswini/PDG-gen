import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;++i) a[i]=sc.nextInt();

        int count=0;
        for (int i=0;i<n;++i) if (a[i]==0) ++count;

        //System.out.println(Arrays.toString(a));

        if (n%2==1)
        {
            if (count!=1)
            {
                System.out.println(0);
                System.exit(0);
            }
        }else
        {
            if (count!=0)
            {
                System.out.println(0);
                System.exit(0);
            }
        }

        Map<Integer,Integer> acon=new HashMap();
        for (int i=0;i<n;++i)
        {
            int aa=a[i];
            //System.out.println(aa);
            if (acon.get(aa)==null)
            {
                acon.put(aa,1);
            }else
            {
                acon.put(aa,(acon.get(aa)+1));
            }
        }
        //System.out.println("================");

//        for (int i:acon.keySet())
//        {
//            System.out.println("key="+i);
//            System.out.println("value="+acon.get(i));
//        }
//        System.out.println("================");

        for (int aa:acon.keySet())
        {
            if (acon.get(aa)!=2)
            {
                if (aa!=0)
                {
                    System.out.println(0);
//                    System.out.println("key="+aa);
//                    System.out.println("value="+acon.get(aa));
//                    System.out.println("out3");
                    System.exit(0);
                }
            }
        }

        if (n%2==1)
        {
            long d=(long) Math.pow(2,(n-1)/2);
            System.out.println(d);
        }else
        {
            long d=(long)Math.pow(2,(n/2));
            System.out.println(d);
        }
    }
}