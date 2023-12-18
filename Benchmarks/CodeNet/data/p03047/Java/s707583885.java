import javax.management.monitor.CounterMonitor;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //変数
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int answer=0;
        //List<Integer> list = new ArrayList<>();
        //int array[] = new int[];

        //
        Output o1=new Output();
        Euclid e1=new Euclid();
        Compute c1=new Compute();

        //入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();


        //処理
        answer=n-k+1;
        //出力
        System.out.println(answer);
    }
}

class Output
{
    //answerの出力
    void Ans(int ans)
    {
        System.out.println(ans);
    }

    void Ans(double ans)
    {
        System.out.println(ans);
    }

    void Ans(String ans)
    {
        System.out.println(ans);
    }

    //配列の出力
    void OutputArray(int array[])
    {
        System.out.println(Arrays.toString(array));
    }

    void OutputArray(double array[])
    {
        System.out.println(Arrays.toString(array));
    }

    void OutputArray(String array[])
    {
        System.out.println(Arrays.toString(array));
    }
    //二次元配列の出力
    void OutputDeepArray(int array[][])
    {
        System.out.println(Arrays.deepToString(array));
    }

    void OutputDeepArray(double array[][])
    {
        System.out.println(Arrays.deepToString(array));
    }

    void OutputDeepArray(String array[][])
    {
        System.out.println(Arrays.deepToString(array));
    }
    //listの出力
    void OutputIntList(List <Integer> list)
    {
        System.out.println(Arrays.toString(list.toArray()));
    }

    void OutputDoubleList(List <Double> list)
    {
        System.out.println(Arrays.toString(list.toArray()));
    }

    void OutputSList(List <String> list)
    {
        System.out.println(Arrays.toString(list.toArray()));
    }
}

class Euclid
{
    public static int gcd(int x,int y)//ユークリッドの互除法を使って2値の最大公約数を求める
    {
        int tmp;
        if(x<y)
        {
            tmp=x;
            x=y;
            y=tmp;
        }
        if(x==0)//(x or y)=0の時は0でない時の値を返す
        {
            return y;
        }else if(y==0)
        {
            return x;
        }else
        {
            while ((tmp = x % y) != 0)
            {
                x = y;
                y = tmp;
            }
            return y;
        }
    }
}

class Compute
{
    int cumulativeSum(int A[],int k)//kの大きさごとに配列Aを切り取ってその区間内の数を足した時の最大値をreturn
    {
        int ans=0;
        //累積和表を作成
        int B[]=new int[A.length+1];//累積和に使う配列
        B[0]=0;
        for(int i=1;i<B.length;i++)
        {
            B[i]=B[i-1]+A[i-1];
        }

        //最大値を求める
        int tmp=0;
        ans=B[k]-B[0];
        for(int i=1;i<A.length-k;i++)
        {
            tmp=B[i+k]-B[i];
            if(tmp>ans)
            {
                ans=tmp;
            }
        }
        System.out.println(Arrays.toString(B));
        return ans;
    }
}