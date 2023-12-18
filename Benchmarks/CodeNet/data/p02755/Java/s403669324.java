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
        //int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();

        int aUpper = (int)Math.floor((a+1)/0.08);
        int aLower = (int)Math.floor(a/0.08);
        int bUpper = (int)Math.floor((b+1)/0.1);
        int bLower = (int)Math.floor(b/0.1);
//        System.out.println(aUpper+","+aLower);
//        System.out.println(bUpper+","+bLower);

        for (int i = aLower;i < aUpper;++i) aList.add(i);
        for (int i = bLower;i < bUpper;++i) bList.add(i);

//        System.out.print("alist = <");
//        for (int i:aList) System.out.print(i+",");
//        System.out.println(">");
//
//        System.out.print("blist = <");
//        for (int i:bList) System.out.print(i+",");
//        System.out.println(">");

        int an1 = -1;
        for (int i:bList)
        {
            if (aList.contains(i))
            {
                an1 = i;
                break;
            }
        }

        System.out.println(an1);
        sc.close();
    }
}