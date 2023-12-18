import java.util.*;

class Main {
    static int f(int[]e){
        int m=24;
        for(int i=0;i<24;++i)
            for(int j=0;j<24;++j)
                if(i!=j&&e[i]>0&&e[j]>0)
                    m=Math.min(m,Math.min((i-j+24)%24,(j-i+24)%24));
        return m;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int[]d=new int[13];
        d[0]=1;
        for(int i=0;i<n;++i){
            d[scan.nextInt()]++;
        }
        for(int i=0;i<=12;++i)
            if(((i==0||i==12)&&d[i]>=2)||(i!=0&&i!=12&&d[i]>=3)){
                System.out.println(0);
                return;
            }
        int[]e=new int[24];
        int s=0;
        for(int i=0;i<=12;++i){
            if(d[i]==0)continue;
            if(((i==0||i==12)&&d[i]==1)||(i!=0&&i!=12&&d[i]==2)){
                e[i]=e[(24-i)%24]=1;
                continue;
            }
            s|=1<<i;
        }
        int m=0;
        for(int t=0;t<=s;++t){
            if((t|s)!=s)continue;
            for(int i=1;i<=11;++i)
                if((t&1<<i)!=0)e[i]=1;
                else if((s&1<<i)!=0)e[24-i]=1;
            m=Math.max(m,f(e));
            for(int i=1;i<=11;++i)
                if((s&1<<i)!=0)e[i]=e[24-i]=0;
        }
        System.out.println(m);
    }
}
