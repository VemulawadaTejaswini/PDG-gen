import java.util.*;
public class Main
{
    static int sieve[] = new int[1000001];

    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int arr[] = new int[n];


        for(int i = 0 ; i < n ; i++)
            arr[i] = kb.nextInt();
        buildsieve();

        Set<Integer> set = new HashSet<Integer>();
        int flag1 = 0;
        int flag2 = 0;

        for(int i = 0 ; i < n ; i++)
        {
            int temp = arr[i];
            Set<Integer> local = new HashSet<>();
            while(temp != 1)
            {
                local.add(sieve[temp]);
                temp = temp / sieve[temp];
            }
            for(int k : local)
            {
                if(set.contains(k))
                {
                    flag1 = 1;
                    break;
                }
                set.add(k);
            }
        }

        int temp = arr[0];
        for(int i = 1 ; i < n ; i++)
        {
            temp = gcd(temp,arr[i]);
        }

        flag2 = (temp == 1)?0:1;

        if(flag1 == 0)
        {
            System.out.println("pairwise coprime");
        }
        else if(flag2 == 0)
        {
            System.out.println("setwise coprime");
        }
        else
        {
            System.out.println("not coprime");
        }

    }
    public static int gcd(int a,int b)
    {
        if(b == 0) return a;
        return gcd(b,a%b);
    }
    public static void buildsieve()
    {
        int visited[] = new int[1000001];

        for(int p = 2 ; p*p <= 1000000 ; p++)
        {
            if(visited[p] == 0)
            {
                sieve[p] = p;
                visited[p] = 1;
                for(int i = p*p ; i <= 1000000 ; i+=p)
                {
                    sieve[i] = p;
                    visited[i] = 1;
                }
            }
        }
    }
}