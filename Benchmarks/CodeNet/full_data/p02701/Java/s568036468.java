import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S[] = new String[N];
        int sum = 0;
        for(int i=0;i<N;i++)
        {
            S[i] = sc.next();
        }
        for(int j=0;j<N-1;j++)
        {
            for(int k=1;k<N;k++)
            {
                if(!(S[j].equals(S[k])))
                {
                    sum ++;
                }
            }
        }
        if(sum>=N-1)
        {
            System.out.println(N-1);    
        }
        else System.out.println(sum);
        
    }
}