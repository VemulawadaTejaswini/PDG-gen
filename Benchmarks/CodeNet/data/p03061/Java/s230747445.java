import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Long As[] = new Long[N];
        for(int i = 0;i < N;i++)
            As[i] = sc.nextLong();
        long max_gcd = 0;
        for(int i = 0;i < N;i++){
            long gcd = get_GCD(As,i);
            if(max_gcd < gcd)
                max_gcd = gcd;
        }
        System.out.println(max_gcd);
    }

    public static Long get_GCD(Long[] As,int ignore){
        Long tmp = new Long(ignore == 0 ? As[1] : As[0]);
        for(int i = 0;i < As.length;i++){
            if(i == ignore)
                continue;
            tmp = gcd(As[i],tmp);
        }
        return new Long(tmp);
    }



    public static Integer min(List<Integer> ar){
        int min = 10000;
        int index = 0;
        for(int i = 0; i< ar.size();i++){
            if(min > ar.get(i)){
                min = ar.get(i);
                index = i;
            }
        }
        return min;
    }


    public static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

}



