import javax.management.monitor.CounterMonitor;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //
        //Euclid e1=new Euclid();//ユークリッドの互除法
        //Compute c1=new Compute();//累積和，
        //変数
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //int answer=0;
        StringBuilder answer=new StringBuilder();
        //List<Integer> list = new ArrayList<>();
        //int array[] = new int[];

        //入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int  K= sc.nextInt();
        String S=sc.next();
        //String[] s=new String[N];

        String s[]=new String[N];
        K--;
        for(int i=0;i<s.length;i++)
        {
            s[i]=S.substring(i,i+1);
        }

        if(s[K].equals("A"))
        {
            s[K]="a";
        }else if(s[K].equals("B"))
        {
            s[K]="b";
        }else if(s[K].equals("C"))
        {
            s[K]="c";
        }

        for(int i=0;i<s.length;i++)
        {
            answer.append(s[i]);
        }
        //出力
        //System.err.println();//標準エラー出力
        System.out.println(answer.toString());
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