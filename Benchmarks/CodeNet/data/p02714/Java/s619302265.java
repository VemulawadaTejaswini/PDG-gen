import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        long count = 0;
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(S.substring(i,i+1).equals(S.substring(j,j+1)))
                    continue;
                for(int k=j+1;k<N;k++)
                {
                    if(j - i == k - j)
                        continue;
                    if(S.substring(i,i+1).equals(S.substring(k,k+1)) || S.substring(j,j+1).equals(S.substring(k,k+1)))
                        continue;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
