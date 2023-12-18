import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
       int a=sc.nextInt();
       int b=sc.nextInt();
        int p=(int)(a/0.08);
        while((int)(p*0.08)<a){
            p++;
        }
        int q=(int)((a+1)/0.08);
        while((int)(q*0.08)>a){
            q--;
        }
        int x=b*10;
        int y=b*10+9;
        int c[]=new int[10010];
        for(int i=p;i<=q;i++)
            c[i]++;
        for(int i=x;i<=y;i++)
            c[i]++;
        int flag=0;
        for(int i=0;i<c.length;i++)
            if(c[i]==2) {
                System.out.println(i);
                flag++;
                break;
            }
        if(flag==0)
            System.out.println("-1");

    }
}



