import java.util.*;
 
public class Main
{
    public static long fact(int i)
    {
        if(i<=1){
            return 1;
        }else{
            return i*fact(i-1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int k;
        n = sc.nextInt();
        k = sc.nextInt();
 
        long s = 0;
        long l = 1000000007;
        long nexttoC = 0;
        long totalC = 0;
        long nonexttoC = 0;
        for(int i = 1; i<k+1; i++)
        {
            if(i==1){
                s = fact(i+n-k)/(fact(i)*fact(n-k));
            }
            else{
                totalC = fact(n-k+i)/fact(n-k)/fact(i);
                nexttoC = (fact(n-k+1)/fact(i)/fact(n-k+1-i))*fact(n-k);
                nonexttoC = totalC - nexttoC;
                s = nonexttoC * fact(k)/fact(i)/fact(k-i);
            }
            System.out.println(s%l);
 
        }
    }
}