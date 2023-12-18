import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        //変数
        int count=0;
        boolean sw=false;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int answer=0;
        int tmp=0;
        List<Integer> list1=new ArrayList<>();
        int array1[]=new int[5];
        int flag=0;
        String s1="";
        String s2="";
        //入力
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        //処理
        int slength=S.length();
        for(int i=1;i<slength;i++)
        {
            s1=S.substring(i,i+1);
            s2=S.substring(i-1,i);
            if(s1.equals(s2))
            {
                if(flag==0)
                {
                    count++;
                    flag=1;
                }else//flag==1
                {
                    flag=0;
                }
            }else
            {
                if(flag==1)
                {
                    count++;
                }
            }
        }
        answer=count;
        //Collections.sort(a);
        //System.out.println(Arrays.toString(a.toArray()));
        //System.out.println(Arrays.toString(array1));
		//System.out.println(Arrays.deepToString(a));
        System.out.println(answer);
    }
}