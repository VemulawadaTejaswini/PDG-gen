import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        double n=sc.nextDouble();
        int count1=0;
        for(double a=1;a<n;a++)
        {
            for(double b=1;b<n;b++)
            {
                for(double c=1;c<n;c++)
                {
                    if(a*b+c==n)
                    {
                        count1++;
                    }
                }
            }
        }
        System.out.println(count1);
        sc.close();
    }
}
