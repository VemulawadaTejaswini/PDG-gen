import java.util.*;

class Main{
    //150a
    static final long DIV = 100000007L;
    static final int MAX = 2000000000;
    //static long[] fac = new long[MAX];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //String[] s = new String[40320];
        ArrayList<Integer> num = new ArrayList<Integer>();

        for(int i = 1;i <= n;i++)num.add(i);
        int a = 0;
        for(int i = 0;i < n;i++){
            int hoge = sc.nextInt();
            for(int j = 0;j < n;j++){
                if(num.get(j) == hoge){
                    num.remove(j);
                    hoge = j;
                    //System.out.println("poyo");
                    break;
                }
            }

            if(i == n-1)break;

            a += fact(num.size())*(hoge);
            
        }
        num.clear();
        for(int i = 1;i <= n;i++)num.add(i);

        int b = 0;
        for(int i = 0;i < n;i++){
            int hoge = sc.nextInt();     
            for(int j = 0;j < n;j++){
                if(num.get(j) == hoge){
                    num.remove(j);
                    hoge = j;
                    //System.out.println("poyopoyo");
                    break;
                }
            }
            if(i == n-1)break;
            b += fact(num.size())*hoge;
        }
        //System.out.println(a);
        //System.out.println(b);
        a -= b;
        if(a<0)a*=-1;
        System.out.println(a);
        
    }

    static int fact(int i){
        if(i == 0)return 1;
        return i * fact(i-1);
    }

    static long modpow(long n){
        long ans =1;
        long a = 2;
        long m = n;
        while(m>0){
            if((m&1)==1)ans = ans*a % DIV;
            a = a * a % DIV;
            m >>= 1;
        }
        return ans;
    }

    static long modcomb(long n,long r){
        return 1;
    }
    
}