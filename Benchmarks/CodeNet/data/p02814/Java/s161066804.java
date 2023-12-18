import java.util.*;

public class Main {

    static long pow(long a,int n) {
        long res=1;
        while (n>0) {
            if ((n-n/2*2)==1) {
                res=res*a;
            }
            a=a*a;
            n>>=1;
        }
        return res;
    }

    static ArrayList<int[]> factorization (int n) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        int tmp= n ;
        for (int i=2;i<=Math.sqrt(n);i++) {
            if (tmp%i==0) {
                int cnt=0;
                while (tmp%i==0) {
                    cnt++;
                    tmp/=i;
                }
                int[] x = {i, cnt};
                list.add(x);
            }
        }
        if (tmp!=1) {
            int[] x = {tmp, 1};
            list.add(x);
        }

        if (list.size()==0) {
            int[] x = {n, 1};
            list.add(x);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[N];
        HashMap<Integer, Integer> lcm = new HashMap<Integer, Integer>();
        boolean flag = true;
        for (int i=0;i<N;i++) {
            a[i] = sc.nextInt();
            ArrayList<int[]> list = factorization(a[i]);
            for (int[] arr : list) {
                if (!lcm.containsKey(arr[0])) {
                    lcm.put(arr[0], arr[1]);
                } else {
                    if (arr[0]==2 && arr[1]!=lcm.get(arr[0])) {
                        flag = false;
                        break;
                    }
                    if (arr[1]>lcm.get(arr[0])) {
                        lcm.put(arr[0], arr[1]);
                    }
                }
            }
        }
        if (!flag) {
            System.out.println(0);
            return;
        }
        long lcm_num = 1L;
        ArrayList<Integer> key = new ArrayList<Integer>(lcm.keySet());
        ArrayList<Integer> val = new ArrayList<Integer>(lcm.values());
        int two_pow = -1;
        for (int i=0;i<key.size();i++) {
            if (key.get(i)!=2) lcm_num *= pow(key.get(i), val.get(i));
            if (key.get(i)==2) two_pow = val.get(i);
            if (lcm_num>1_000_000_000_000L) {
                System.out.println(0);
                return;
            }
        }
        long tmp = M;
        if (two_pow!=-1) tmp /= pow(2, two_pow);
        // System.out.println("M: "+M);
        // System.out.println("lcm: "+lcm_num);
        System.out.println((M-lcm_num)/(2*lcm_num)+1);
    }
}