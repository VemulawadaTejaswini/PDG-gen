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
        int H = sc.nextInt();
        int W = sc.nextInt();
        String a[]=new String[H];
        String[][] A=new String[H][W];
        for(int i=0;i<H;i++)
        {
            a[i]=sc.next();
        }
        for(int i=0;i<H;i++)
        {
            String tmp=a[i];
            for(int j=0;j<W;j++)
            {
                A[i][j]=tmp.substring(j,j+1);
            }
        }
        //処理

        while(sw==false)
        {
            count++;
            if(H==1 && W==1)
            {
               // System.err.println(A[0][0]);
                if(A[0][0].equals("#"))
                {
                    count=2;
                    break;
                }else
                {
                    count=1;
                    break;
                }
            }
            sw=true;
            String AA[][]=new String[H][W];
            for(int i=0;i<H;i++)
            {
                for(int j=0;j<W;j++)
                {
                    AA[i][j]=".";
                }
            }
            //System.err.println(Arrays.deepToString(AA));
            if(H==1)
            {
                for(int j=0;j<W;j++)
                {
                    if(A[0][j].equals("#"))
                    {
                        if(j==0)
                        {
                            AA[0][j+1]="#";
                            AA[0][j]="#";
                        }else if(j==W-1)
                        {
                            AA[0][j-1]="#";
                            AA[0][j]="#";
                        }else
                        {
                            AA[0][j-1]="#";
                            AA[0][j+1]="#";
                            AA[0][j]="#";
                        }
                    }else
                    {
                        sw=false;
                    }
                }
                A = AA;
            }else if(W==1)
            {
                for(int i=0;i<H;i++)
                {
                    if(A[i][0].equals("#"))
                    {
                        if(i==0)
                        {
                            AA[i+1][0]="#";
                            AA[i][0]="#";
                        }else if(i==H-1)
                        {
                            AA[i-1][0]="#";
                            AA[i][0]="#";
                        }else
                        {
                            AA[i-1][0]="#";
                            AA[i+1][0]="#";
                            AA[i][0]="#";
                        }
                    } else
                    {
                        sw=false;
                    }
                }
                A = AA;
            }else {
                for (int i = 0; i < H; i++) {
                    //System.err.println("i " + i);
                    for (int j = 0; j < W; j++) {
                        //System.err.println("j " + j);
                        if (A[i][j].equals("#")) {
                            if (i == 0 && j == 0) {
                                AA[0][1] = "#";
                                AA[1][0] = "#";
                                AA[i][j] = "#";
                            } else if (i == 0 && j == W - 1) {
                                AA[0][W - 2] = "#";
                                AA[1][W - 1] = "#";
                                AA[i][j] = "#";
                            } else if (i == H - 1 && j == 0) {
                                AA[H - 2][0] = "#";
                                AA[H - 1][1] = "#";
                                AA[i][j] = "#";
                            } else if (i == H - 1 && j == W - 1) {
                                AA[H - 2][W - 1] = "#";
                                AA[H - 1][W - 2] = "#";
                                AA[i][j] = "#";
                            } else if (i == 0) {
                                AA[i][j + 1] = "#";
                                AA[i][j - 1] = "#";
                                AA[i + 1][j] = "#";
                                AA[i][j] = "#";
                            } else if (i == H - 1) {
                                AA[i][j + 1] = "#";
                                AA[i][j - 1] = "#";
                                AA[i - 1][j] = "#";
                                AA[i][j] = "#";
                            } else if (j == 0) {
                                AA[i - 1][j] = "#";
                                AA[i + 1][j] = "#";
                                AA[i][j + 1] = "#";
                                AA[i][j] = "#";
                            } else if (j == W - 1) {
                                AA[i - 1][j] = "#";
                                AA[i + 1][j] = "#";
                                AA[i][j - 1] = "#";
                                AA[i][j] = "#";
                            } else {
                                AA[i - 1][j] = "#";
                                AA[i + 1][j] = "#";
                                AA[i][j - 1] = "#";
                                AA[i][j + 1] = "#";
                                AA[i][j] = "#";
                            }
                        } else {
                            sw = false;
                        }
                    }
                }
                A = AA;
                //System.err.println(Arrays.deepToString(A));
            }
        }
        //Collections.sort(a);
        answer=count-1;
        o1.Ans(answer);
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