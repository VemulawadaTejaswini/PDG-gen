// JAVA Code For Efficient program to print 
// the number of factors of n numbers 
import java.util.*;

public class Main {

    static int MAX = 1000001;
    static int factor[];

    // function to generate all prime
    // factors of numbers from 1 to 10^6
    static void generatePrimeFactors()
    {
        factor[1] = 1;

        // Initializes all the positions with
        // their value.
        for (int i = 2; i < MAX; i++)
            factor[i] = i;

        // Initializes all multiples of 2 with 2
        for (int i = 4; i < MAX; i += 2)
            factor[i] = 2;

        // A modified version of Sieve of
        // Eratosthenes to store the
        // smallest prime factor that
        // divides every number.
        for (int i = 3; i * i < MAX; i++) {
            // check if it has no prime factor.
            if (factor[i] == i) {
                // Initializes of j starting from i*i
                for (int j = i * i; j < MAX; j += i) {
                    // if it has no prime factor
                    // before, then stores the
                    // smallest prime divisor
                    if (factor[j] == j)
                        factor[j] = i;
                }
            }
        }
    }

    // function to calculate number of factors
    static int calculateNoOFactors(int n)
    {
        if (n == 1)
            return 1;

        int ans = 1;

        // stores the smallest prime number
        // that divides n
        int dup = factor[n];

        // stores the count of number of times
        // a prime number divides n.
        int c = 1;

        // reduces to the next number after prime
        // factorization of n
        int j = n / factor[n];

        // false when prime factorization is done
        while (j != 1) {
            // if the same prime number is dividing n,
            // then we increase the count
            if (factor[j] == dup)
                c += 1;

			/* if its a new prime factor that is 
			factorizing n, then we again set c=1 
			and change dup to the new prime factor, 
			and apply the formula explained 
			above. */
            else {
                dup = factor[j];
                ans = ans * (c + 1);
                c = 1;
            }

            // prime factorizes a number
            j = j / factor[j];
        }

        // for the last prime factor
        ans = ans * (c + 1);

        return ans;
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        // array to store prime factors
        factor = new int[MAX];
        factor[0] = 0;

        // generate prime factors of number
        // upto 10^6
        generatePrimeFactors();

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();


        long ans=0;
        for (int i = 1; i <= n-1; i++) {
            int x =calculateNoOFactors(i);
//            if (Math.sqrt(i)*Math.sqrt(i)==i){
//                ans+=2*x-1;
//                System.out.println(i+" "+(2*x-1)+" "+x);
//            }
//            else {
//                ans+=2*x;
//                System.out.println(i+" "+2*x+" "+x);
//            }
            ans+=x;
        }
        System.out.println(ans);
    }
}

// This code is contributed by Arnav Kr. Mandal. 
