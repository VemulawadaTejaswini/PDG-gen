import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int maxdivisor = euclidean(a, b);
        int res = numberOfDivisor(maxdivisor);
        System.out.println(res);
    }


    public static int euclidean(int a, int b) {
        int l1 = a;
        int l2 = b;

        while(l1%l2!=0){
            int tmp = l1%l2;
            l1 = l2;
            l2 = tmp;
        }
        return l2;
    }

    public static int numberOfDivisor(int a) {
        int p = a;
        int res = 1;
        int mod = 2;
        while(p!=1){
            if(p%mod==0)res++;
            while(p%mod==0){
                p/=mod;
            }
            mod++;
        }
        return res;

    }
}
