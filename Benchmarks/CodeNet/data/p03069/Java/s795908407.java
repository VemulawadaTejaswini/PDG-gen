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
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        int array1[]=new int[5];
        int array2[]=new int[5];
        List<String> slist=new ArrayList<>();
        //入力
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String S=sc.next();
        //処理
        String siro=".";//白
        String kuro="#";//黒
            if(S.indexOf(kuro)==-1)
            {
                count=0;
            }else
            {
                for(int i=0;i<N;i++)
                {
                    String ss=S.substring(i,i+1);
                    if(ss.equals("."))
                    {
                        count++;
                    }
                }
            }

        answer=count;
        //Collections.sort(a);
        //System.out.println(Arrays.toString(list1.toArray()));
        //System.out.println(Arrays.toString(array1));
		//System.out.println(Arrays.deepToString(a));
        System.out.println(answer);
    }
}
