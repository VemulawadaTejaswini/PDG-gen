import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int n;
            int x;
            int count = 0;
            n = sc.nextInt();
            x = sc.nextInt();
            if(n==0&&x==0)return;
            for(int i=1;i<=n;i++)
            {
                for(int j=i+1;j<=n;j++)
                {
                    for(int k = j+1;k<=n;k++)
                    {
                        if(i+j+k==x)
                        {
                            count++;
                            break;
                        }
                    }
                }
            }
            System.out.println(count);
        }
	}
}