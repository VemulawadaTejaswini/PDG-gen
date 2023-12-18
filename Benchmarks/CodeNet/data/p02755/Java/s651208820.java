import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=1;i<1000;i++)
        {
            int countA= (int) (i*0.08);
            int countB=(int)(i*0.1);
            if(countA==a&&countB==b)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}