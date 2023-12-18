import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 1;

        if(x >= 4){
            for(int i=2; i*i <= x; i++)
            {
                int j=1;
                double num = 1;
                while(num <= x){
                    j++;
                    num = Math.pow(i, j);
                }
                num = num/i;
                if(num > ans && num <= x){
                    ans = (int)(num);
                }
            }
        }
        System.out.println(ans);
    }
}