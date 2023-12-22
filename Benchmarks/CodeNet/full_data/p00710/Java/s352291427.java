import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,r,p,c;
        int i,k;

        while(true)
        {
            n = sc.nextInt();  r=sc.nextInt();
            if(n==0 && r==0) break;

            List<Integer> huda = new ArrayList<Integer>();
            for(i=0; i<n; i++) huda.add(i+1);

            for(i=0;i<r;i++)
            {
                p=sc.nextInt(); c=sc.nextInt();
                for(int y=0; y<c; y++) huda.add(huda.remove(n-p-c+1));
            }

            System.out.println(huda.remove(n-1));
        }
        sc.close();
    }
}
