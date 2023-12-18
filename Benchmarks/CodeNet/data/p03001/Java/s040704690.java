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
        double answer = 0;
        //String answer="Yes";
        //StringBuilder answer=new StringBuilder();
        //List<Integer> list = new ArrayList<>();
        //int array[] = new int[];

        int ans=0;
        //入力
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        if((x==0 && y==0) || (x==W && y==0) || (x==W && y==H) || (x==0 && y==H))
        {
            ans=0;
            double a=W*H;
            double b=a/2;
            //System.err.println(b);
            answer=b;
        }else {
            if (W < H)//縦長
            {
                int w = Math.min(x, W - x);
                if(w==0)
                {
                    int h=Math.min(y,H-y);
                    answer=W*h;
                    if(x==W-x){ans=1;}
                    else {ans=0;}
                }else
                {
                    answer = H * w;
                    if(y==H-y) {ans=1;}
                    else {ans=0;}
                }
            } else if (W > H)//横長
            {
                int h = Math.min(y, H - y);
                if(h==0)
                {
                    int w=Math.min(x,W-x);
                    answer=H*w;
                    if(y==H-y) {ans=1;}
                    else {ans=0;}
                }else
                {
                    answer = W * h;
                    if(x==W-x){ans=1;}
                    else {ans=0;}
                }
            } else if (W == H)//正方形
            {
                if(x==W)
                {
                    double answer1=Math.min(y,H-y)*W;
                    double a=Math.max(y,H-y)*W;
                    double answer2=a/2;
                    if(answer1==answer2)
                    {
                        ans=1;
                        answer=Math.max(answer1,answer2);
                    }else
                    {
                        ans=0;
                        answer=Math.max(answer1,answer2);
                    }
                }else if(y==H)
                {
                    double answer1=Math.min(x,W-x)*H;
                    double a=Math.max(x,W-x)*H;
                    double answer2=a/2;
                    if(answer1==answer2)
                    {
                        ans=1;
                        answer=Math.max(answer1,answer2);
                    }else
                    {
                        ans=0;
                        answer=Math.max(answer1,answer2);
                    }
                }else
                {
                    int h = Math.min(y, H - y);
                    answer = W * h;
                    ans = 1;
                }
            }
        }
        //出力
        //BigDecimal bd = new BigDecimal(answer);
        //System.out.println(bd.setScale(12,BigDecimal.ROUND_DOWN));
        //System.out.println(String.format("%.0f",answer));
        //System.out.println(answer);
        System.out.println(String.format("%.9f",answer)+" "+ans);
    }
}