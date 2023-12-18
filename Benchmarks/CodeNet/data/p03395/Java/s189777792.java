import java.util.Scanner;
class Main{

    static int[] a;
    static int[] b;
    static int N;
    static int getMaxk(){
        int res = -1;
        for(int i=0;i<N;++i){
            for(int j=1;j<a[i];++j){
                if(a[i]==b[i])continue;
                if(a[i]%j==b[i] || a[i]%j > b[i]*2){
                    res = Math.max(res,j);
                    break;
                }
            }
        }
        return res;
    }

    static boolean chk(){
        for(int i=0;i<N;++i)if(a[i]!=b[i])return false;
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        a = new int[N];
        b = new int[N];
        for(int i=0;i<N;++i)a[i]=scan.nextInt();
        for(int i=0;i<N;++i)b[i]=scan.nextInt();
        long ans = 0;
        while(true){
            if(chk()){
                System.out.println(ans);
                return;
            }
            int k = getMaxk();
            if(k==-1){
                System.out.println(-1);
                return;
            }
            ans += ((long)1<<k);
            for(int i=0;i<N;++i){
                if(a[i]%k==b[i] || a[i]%k > b[i]*2)a[i]%=k;
            }
        }

    }
}