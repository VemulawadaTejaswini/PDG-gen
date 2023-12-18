import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(s.nextLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(s.nextLine());
        int[] houses = new int[N];
        for(int i=0;i<N;i++)
        {
            houses[i] = Integer.parseInt(st.nextToken());
        }
        int distance = Integer.MAX_VALUE;
        for(int i=0;i<N;i++)
        {
            int start = houses[i];
            int d = 0;
            int end;
            if(i==0)
                end = houses[N-1];
            else
                end = houses[i-1];
            if(start == 0)
                d = Math.abs(end - start);
            else
                d = K - Math.abs(end - start);
            distance = Math.min(distance, d);
        }
        System.out.println(distance);
    }
}
