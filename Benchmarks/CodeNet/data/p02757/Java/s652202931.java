import java.util.*;
import java.math.*;
class Main {
    //
    static final int MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        String s = sc.next();
        char[] str = s.toCharArray();
        int[] strnum = new int[n];
        int[] mod = new int[n];
        for(int i = 0;i < n;i++){
            strnum[i] = str[i]-'0';
        }
        mod[n-1] = strnum[n-1]%p;
        for(int i = n-2;i >= 0;i--){
            mod[i] = (int)(mod[i+1]+strnum[i]*pow(10,n-i-1,p))%p;
            if(mod[i]<0)mod[i]+=p;
        }
        int ans = 0;
        if(p==2||p==5){
            for(int i = 0;i < n;i++){
                if(strnum[i]%p==0)ans+=i+1;
            }
        }else{
            int[] count = new int[p];
            for(int i = 0;i < n;i++){
                count[mod[i]]++;
            }
            ans += count[0]*(count[0]+1)/2;
            for(int i = 1;i < p;i++){
                ans += count[i]*(count[i]-1)/2;
            }
            //System.out.println("poyo");
        }
        System.out.println(ans);

    }
    public static long pow(long a, long b, int M) {
		long ret = 1;
		long tmp = a;
		while (b > 0) {
			if ((b & 1) == 1)
				ret = (ret * tmp) % M;
			tmp = (tmp * tmp) % M;
			b = b >> 1;
        }
        
		return ret;
	}
}

