// not solved by myself
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();

        long count = 1;
        long tmp = X;

        while(true){
            tmp *= 2;
            if(tmp <= Y)
                count++;
            else
                break;
        }

        System.out.println(count);



    }

     public static long max(int[] ar,int size){
        long max = 0;
        for(int i = 0; i< size;i++)
            if(max < ar[i])
                max = ar[i];
        return max;
    }


    public static long max(List<Long> ar){
        long max = 0;
        for(int i = 0; i< ar.size();i++)
            if(max < ar.get(i))
                max = ar.get(i);
        return max;
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
        if(m == 0)
            return n;
        if(n == 0)
            return m;
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

}



