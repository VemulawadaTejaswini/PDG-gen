import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Compute c1 = new Compute();//計算系
        //変数
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //int answer = 0;
        //String answer="No";
        //StringBuilder answer=new StringBuilder();

        //入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;++i)  a[i]=sc.nextInt();
        //Arrays.sort(a);
        //System.out.println(Arrays.toString(a));
        for (int i=0;i<n;++i)
        {
            int b[]=new int[n];
            System.arraycopy(a,0,b,0,n);
            b[i]=Integer.MIN_VALUE;
            Arrays.sort(b);
            System.out.println(b[n-1]);
        }

        //出力
        //BigDecimal bd = new BigDecimal(answer);
        //System.out.println(bd.setScale(12,BigDecimal.ROUND_DOWN));
        //System.out.println(String.format("%.0f",answer));
        //System.out.println(answer);
    }
}