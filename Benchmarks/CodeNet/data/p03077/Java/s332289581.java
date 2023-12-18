import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        //変数
        int count=0;
        boolean sw=false;
        int max=Integer.MIN_VALUE;
        //int min=Integer.MAX_VALUE;
        long mmin=0;
        long answer=0;
        int tmp=0;
        List<Long> a=new ArrayList<>();

        long b=0;
        long c=0;
        long d=0;
        //入力
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        long A=sc.nextLong();
        long B=sc.nextLong();
        long C=sc.nextLong();
        long D=sc.nextLong();
        long E=sc.nextLong();
        //処理
        a.add(A);
        a.add(B);
        a.add(C);
        a.add(D);
        a.add(E);
        Collections.sort(a);
        mmin=a.get(0);
        for(int i=0;i<5;i++)
        {
            if(mmin==a.get(i))
            {
                count++;
            }
        }
        if(N<A && N<B && N<C && N<D && N<E)
        {
            answer=5;
        }else
        {
            b=N/mmin;
            c=N%mmin;
            d=(b+c)*count;
            answer=d+4;
        }
        //System.out.println(b);
        //System.out.println(c);
        /*
        Collections.sort(a);
        System.out.println(Arrays.toString(a.toArray()));
        */
        System.out.println(answer);
    }
}