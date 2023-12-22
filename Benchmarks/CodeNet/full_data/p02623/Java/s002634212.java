import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String args[])
    {
        FastReader obj = new FastReader();
        int n = obj.nextInt(),m = obj.nextInt(),k = obj.nextInt();
        int arr[] = new int[n],brr[] = new int[m];
        for(int i=0;i<n;i++) arr[i] = obj.nextInt();
        for(int i=0;i<m;i++) brr[i] = obj.nextInt();
        int top1 = 0,top2 = 0,count = 0;
        while(k>0 && top1<n && top2<m)
        {
            if(arr[top1]<=brr[top2] && arr[top1]<=k)
            {
                k-=arr[top1];
                top1++;
                count++;
            }
            else if(arr[top1]>brr[top2] && arr[top2]<=k)
            {
                k-=brr[top2];
                top2++;
                count++;
            }
            else if(arr[top1]>k && brr[top2]>k)
            {
                top1++;
                top2++;
            }

        }
        if(k>0 && top1<n)
        {
           for(int i=top1;i<n;i++)
           {
               if(arr[i]<=k)
               {
                   k-=arr[i];
                   count++;
               }
           }
        }
        if(k>0 && top2<m)
        {
           for(int i=top2;i<m;i++)
           {
               if(brr[i]<=k)
               {
                   k-=brr[i];
                   count++;
               }
           }
        }
        System.out.println(count);
    }
}
