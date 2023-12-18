import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // 改行
        String[] strz = new String[N];
        for (int n = 0; n < N; n++){
            strz[n] = sc.nextLine();
        }

        for (int n = 0; n < N; n++){
            char[] charn = strz[n].toCharArray();
            Arrays.sort(charn);
            strz[n] = new String(charn);
        }
        Arrays.sort(strz);
  			long ret = 0;
  			long one = 1;
  			Map<String,Long> m = new HashMap<String,Long>();

  			for(int i=0;i<N;i++) {
  				m.merge(strz[i], one, Long::sum);
  			}

  			for(Map.Entry<String, Long> e:m.entrySet()) {
  				ret+=e.getValue()*(e.getValue()-1)/2;
  			}

  			System.out.println(ret);
    }

    public static long f (long n){
        if (n<=1){return 1;}
        return f(n-1)*n;
    }
    public static long conbi(long n,long r){
        return (f(n)/(f(n-r)*f(r)));
    }
}
