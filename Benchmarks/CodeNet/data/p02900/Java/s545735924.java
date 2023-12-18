import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Compute c1 = new Compute();//calc
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //StringBuilder answer=new StringBuilder();
        //input
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();

        long abGCD = c1.gcd(a,b);//abの最大公約数
        //System.out.println(abGCD);

        List<Long> list = c1.divisors(abGCD);//abGCDの中の約数
        Collections.sort(list);//いらない
        //System.out.println(Arrays.toString(list.toArray()));

        long t1 = 1;
        long t2 = 2;
        long t3 = 3;

        boolean tt2=false;
        boolean tt3=false;
        if (list.contains(t2)) tt2=true;
        if (list.contains(t3)) tt3=true;


        List<Long> list2 =new ArrayList<>();
        if (tt2)
        {
            for (long c:list)
            {
                if (c==t1 || c==t2) list2.add(c);
                else
                {
                    if (c%t2!=0) list2.add(c);
                }
            }
        }

        //System.out.println(Arrays.toString(list2.toArray()));

        List<Long> list3 = new ArrayList<>();
        if (tt3)
        {
            for (long c:list2)
            {
                if (c==t1 || c==t3) list3.add(c);
                else
                {
                    if (c%t3!=0) list3.add(c);
                }
            }
        }

        //System.out.println(Arrays.toString(list3.toArray()));

        System.out.println(list3.size());
        sc.close();
    }
}

class BIT
{
    int []bit;
    int n;
    public BIT(int n) {
        this.n = n;
        bit = new int[n + 1];
    }
    int sum(int i) {
        int sum = 0;
        while(i > 0) {
            sum += bit[i];
            i -= i & -i;
        }
        return sum;
    }
    void add(int i, int x) {
        while(i <= n) {
            bit[i] += x;
            i += i & -i;
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

    public int gcd(int x,int y)//ユークリッドの互除法を使って2値の最大公約数を求める(int)
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

    public static long gcd(long x,long y)//ユークリッドの互除法を使って2値の最大公約数を求める(long)
    {
        long tmp;
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

    public int leastCommonMultiple(int a,int b)//最大公倍数(int)
    {
        int ans=1;
        //ans=(a*b)/gcd(a,b);//(2値a,bの最小公倍数は ab/(aとbの最大公約数) で求められる) <- だけどオーバフローする可能性があるので下の処理で
        ans=a/gcd(a,b)*b;
        return ans;
    }

    public long leastCommonMultiple(long a,long b)////最大公倍数(long)
    {
        long ans=1;
        //ans=(a*b)/gcd(a,b);//(2値a,bの最小公倍数は ab/(aとbの最大公約数) で求められる)
        ans=a*gcd(a,b)*b;
        return ans;
    }

    public List<Long> divisors(long n)//ある数の約数を列挙した配列を返す
    {
        List<Long> list =new ArrayList<>();
        for (long i=1;i*i <= n; ++i)
        {
            if (n%i !=0) continue;
            list.add(i);
            if (n/i == i) continue;
            list.add(n/i);
        }

        return list;
    }
}