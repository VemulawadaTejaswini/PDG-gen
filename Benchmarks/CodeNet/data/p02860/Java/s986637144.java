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
        //StringBuilder answer=new StringBuilder();
        //input
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s = sc.next();
        int mojisuu = n/2;
        List<String> moji = new ArrayList<>();
        for (int i=0;i<mojisuu;++i)
        {
            moji.add(s.substring(i,i+1));
        }
        List<String> moji2 = new ArrayList<>();
        for (int i=mojisuu;i<s.length();++i)
        {
            moji2.add(s.substring(i,i+1));
        }

        if (moji.size()!=moji2.size())
        {
            System.out.println("No");
        }else
        {
            int j = 0;
            String answer = "Yes";
            for (int i=0;i<mojisuu;++i)
            {
                if (!moji.get(i).equals(moji2.get(i)))
                {
                    answer = "No";
                    break;
                }
            }
            System.out.println(answer);
        }
        sc.close();
    }
}