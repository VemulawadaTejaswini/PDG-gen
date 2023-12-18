import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int[][] distances = new int[N][N];
        for(int i=0;i<N;i++)
        {
            //System.out.println("i: " + i);
            for(int j=0;j<N;j++)
            {
                int a = Math.abs((i + 1) - (j + 1));
                int b = Math.abs((i + 1) - X) + Math.abs(Y - (j + 1)) + 1;
                int c = Math.abs((i + 1) - Y) + Math.abs(X - (j + 1)) + 1;
                //System.out.println("j: " + j);
                //System.out.println(a + " " + b + " " + c);
                if(a < b && a < c)
                    distances[i][j] = a;
                else if(b < a && b < c)
                    distances[i][j] = b;
                else
                    distances[i][j] = c;
            }
            //System.out.println("-------------------");
        }
//        for(int i=0;i<N;i++)
//            System.out.println(Arrays.toString(distances[i]));
        for(int k=1;k<N-1;k++)
        {
            int count = 0;
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < N; j++)
                {
                    if (j == i)
                        continue;
                    if (distances[i][j] == k)
                        count++;
                }
            }
            System.out.println(count/2);
        }
        System.out.println(0);
    }
}
