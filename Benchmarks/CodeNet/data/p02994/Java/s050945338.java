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
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        int answer = 0;
        //String answer="Good";
        //StringBuilder answer=new StringBuilder();
        //List<Integer> list = new ArrayList<>();
        //int array[] = new int[];

        //入力
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int L=sc.nextInt();

        int l[]=new int[N];
        int key=0;
        for (int i=0;i<N;i++)
        {
            l[i]=L+i;
            if (Math.abs(l[i]) < min)
            {
                min=Math.abs(l[i]);
                key=i;
            }
//            System.err.println("aji "+l[i]);
        }
//        System.err.println(min);
//        System.err.println(key);
        for (int i=0;i<N;i++)
        {
            if (i!=key)
            {
//                System.err.println("aji "+l[i]);
                answer+=l[i];
            }
        }

        //出力
        //BigDecimal bd = new BigDecimal(answer);
        //System.out.println(bd.setScale(12,BigDecimal.ROUND_DOWN));
        //System.out.println(String.format("%.0f",answer));
        System.out.println(answer);
    }
}