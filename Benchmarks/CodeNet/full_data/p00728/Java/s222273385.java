
import java.util.*;
class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int n = sc.nextInt();
            if(n==0)
            {
                break;
            }
            int avg = 0;
            int s[] = new int[n];
            for (int i = 0; i < n; i++)
            {
                s[i] = sc.nextInt();
            }
            //??????????????????
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n - 1; j++)
                {
                    if(s[i]<=s[i+1])
                    {
                        int temp = s[i];
                        s[i] = s[i+1];
                        s[i+1]=temp;
                    }
                }
            }
            for(int i=1; i<n-1; i++)
            {
                avg+=s[i];
            }
            avg/=n;
            System.out.println(avg);
        }
        sc.close();
    }
}