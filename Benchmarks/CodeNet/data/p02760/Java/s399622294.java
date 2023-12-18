import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [][]a=new int[3][3];
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int n=scanner.nextInt();
        while(n>0)
        {
           int x= scanner.nextInt();
            n--;
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    if(a[i][j]==x)a[i][j]=-1;
                }
            }
        }
        for(int i=0;i<3;i++)
        {
            int cnt=0;

            for(int j=0;j<3; j++)
            {
               if(a[i][j]==-1)cnt++;
            }
            if(cnt==3)
            {
                System.out.println("Yes");
                System.exit(0);
            }
            cnt=0;
            for(int j=0;j<3; j++)
            {
                if(a[j][i]==-1)cnt++;
            }
            if(cnt==3)
            {
                System.out.println("Yes");
                System.exit(0);
            }
        }
        if(a[0][0]==-1&&a[1][1]==-1&&a[2][2]==-1||a[0][2]==-1&&a[1][1]==-1&&a[2][0]==-1)
        {
            System.out.println("Yes");
            System.exit(0);
        }
        System.out.println("No");
    }
}