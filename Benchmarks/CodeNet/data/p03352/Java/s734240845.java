import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 1;
        int j;
        double num;

        if(x >= 4){
            for(int i=1; i*i <= x; i++)
            {
                j=2;
                do{
                    num = Math.pow(i, j);
                    if(num > ans){
                        ans = (int)num;
                    }
                    j++;
                }while(num <= x);
            }
        }
        System.out.println(ans);
    }
}