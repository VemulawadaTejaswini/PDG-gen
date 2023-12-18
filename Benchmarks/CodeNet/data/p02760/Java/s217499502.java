import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        boolean[][] b = new boolean[3][3];
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int l = sc.nextInt();
            for (int j=0;j<3;j++){
                for (int k=0;k<3;k++){
                    if (a[j][k]==l)b[j][k]=true;
                }
            }
        }
        boolean bool = false;
        for (int i=0;i<3;i++) {
            if (b[i][0]&&b[i][1]&&b[i][2])bool=true;
            if (b[0][i]&&b[1][i]&&b[2][i])bool=true;
        }
        if (b[0][0]&&b[1][1]&&b[2][2])bool=true;
        if (b[0][2]&&b[1][1]&&b[2][0])bool=true;
        if (bool)System.out.println("Yes");
        else System.out.println("No");
    }
    static long factorial(long num){
        if (num<2)return 1;
        else return num*factorial(num-1);
    }
    static int arraySum(int[] array){
        int ans = 0;
        for (int value : array) ans += value;
        return ans;
    }
    static long combination(long a, long b){
        long data = 1;
        for (int i=0;i<b;i++){
            data*=a-i;
        }
        return data/factorial(b);
    }
    static double log(double base,double antilogarithm){
        return Math.log(antilogarithm)/Math.log(base);
    }

    static long gcd(long x,long y){
        if (y==0)return x;
        else return gcd(y,x%y);
    }
    static long lcm(long x,long y){
        return x/gcd(x,y)*y;
    }
    static HashMap<Long,Long> factorization(long num){
        HashMap<Long,Long> hash = new HashMap<>();
        long n = num;
        long count = 2;
        while (n>1){
            while (n%count==0){
                n/=count;
                if (hash.containsKey(count))hash.put(count,hash.get(count)+1);
                else hash.put(count,1L);
            }
            count++;
        }
        return hash;
    }

}
