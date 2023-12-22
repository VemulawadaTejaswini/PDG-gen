import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");

        int n1=Integer.parseInt(s[0]);
        int n2=Integer.parseInt(s[1]);
        int n3=Integer.parseInt(s[2]);
        int max=Integer.parseInt(s[3]);
        algo(n1,n2,n3,max);
    }

    public static void algo(int n1,int n2,int n3,int max)
    {
        int sum=0;
        if(n1>=max)
        {
            System.out.println(max);
            return;
        }
        max=max-n1;
        sum+=n1;
        if(n2>=max)
        {
            System.out.println(sum);
            return;
        }
        max-=n2;
        sum-=max;
        System.out.println(sum);
    }


}
