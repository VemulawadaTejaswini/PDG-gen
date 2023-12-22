import java.util.Scanner;

class Main
{
    static int n;
    static int q;

    static int Search(int[]s, int t, int n)
    {
        int left = 0;
        int right = n;

        while(left < right)
            {
                int mid = (left + right) / 2;

                if(s[mid] == t)
                    return 1;

                else if(t < s[mid])
                    right = mid;

                else 
                    left = mid + 1;
            }
        return 0;
    }

    public static void main(String[]args)
    {
        Scanner In = new Scanner(System.in);

        n = In.nextInt();
        int []S = new int[n];

        for(int i = 0; i < n; i++)
            {
                S[i] = In.nextInt();
            }

        q = In.nextInt();
        int []T = new int[q];

        for(int i = 0; i < q; i++)
            {
                T[i] = In.nextInt();
            }

        int count = 0;
        for(int i = 0; i < q; i++)
            {
                count += Search(S,T[i],n);
            }

        System.out.println(count);
    }
}