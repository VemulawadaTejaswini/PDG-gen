import java.util.*;

public class Main {

    public static void main(String[] args) {
        //
        //Compute c1=new Compute();//計算系
        //変数
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        int answer = 0;
        //String answer="No";
        //StringBuilder answer=new StringBuilder();
        //List<Integer> list = new ArrayList<>();
        //int array[] = new int[];

        //入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d=sc.nextInt();
        int x[][]=new int[n][d];
        for (int i=0;i<n;++i){for (int j=0;j<d;++j){x[i][j]=sc.nextInt();}}

        for (int k=0;k<n;++k)
        {
            for (int i=k+1;i<n;++i)
            {
                int a=0;
                for (int j=0;j<d;++j)
                {
                    a+=Math.pow(Math.abs(x[k][j]-x[i][j]),2);
                }
                int b=(int)Math.sqrt(a);
                if (a==Math.pow(b,2)) {++count;}
            }
        }
        answer=count;
        //出力
        //BigDecimal bd = new BigDecimal(answer);
        //System.out.println(bd.setScale(12,BigDecimal.ROUND_DOWN));
        //System.out.println(String.format("%.0f",answer));
        System.out.println(answer);
    }
}