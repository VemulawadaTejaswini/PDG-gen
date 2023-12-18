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
        //String answer="Yes";
        //StringBuilder answer=new StringBuilder();
        //List<Integer> list = new ArrayList<>();
        //int array[] = new int[];
        int M=Integer.MIN_VALUE;
        List<Integer> ListX=new ArrayList<>();
        List<Integer> ListY=new ArrayList<>();
        //int x[];
        //int y[];


        //入力
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int A = sc.nextInt();

        if(X<A)
        {
            answer=0;
        }else if(X>=A)
        {
            answer=10;
        }
        //出力
        //BigDecimal bd = new BigDecimal(answer);
        //System.out.println(bd.setScale(12,BigDecimal.ROUND_DOWN));
        //System.out.println(String.format("%.0f",answer));
        System.out.println(answer);
    }
}