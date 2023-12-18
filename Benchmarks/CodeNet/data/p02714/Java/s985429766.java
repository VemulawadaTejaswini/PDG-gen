import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input_n = sc.nextLine();
        String s = sc.nextLine();
        int n = Integer.parseInt(input_n);
        
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        int count = 0;
        
        for(i = 1; i - 1 < n; i++)
        {
            for(j = 2; j < n; j++)
            {
                for(k = 3; k <= n; k++)
                {
                    if(i < j && j < k)
                    {
                        if((j - i) != (k - j))
                        {
                            char s_i = s.charAt(i - 1);
                            char s_j = s.charAt(j - 1);
                            char s_k = s.charAt(k - 1);
                            
                            if(s_i != s_j && s_j != s_k && s_i != s_k)
                            {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        
        System.out.println(count);
    }
}