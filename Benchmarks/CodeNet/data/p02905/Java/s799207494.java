        import java.math.BigInteger;
        import java.util.Scanner;
         
        public class Main {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
         
                int n = in.nextInt();
                int []nums = new int[n];
                for (int i = 0 ; i < n ; i++){
                    nums[i] = in.nextInt();
                }
                BigInteger sum = BigInteger.ZERO;
                for (int i = 0 ; i < n - 1; i++){
                    for (int j = i + 1; j < n; j++){
                        sum = sum.add(BigInteger.valueOf(lcm(nums[i], nums[j]))).mod(BigInteger.valueOf(998244353));
                    }
                }
                System.out.println(sum.toString());
            }
         
         
            public static int gcd(int a, int b)
            {
                if (a == 0)
                    return b;
                return gcd(b % a, a);
            }
         
            public static int lcm(int a, int b)
            {
                return (a*b)/gcd(a, b);
            }
        }