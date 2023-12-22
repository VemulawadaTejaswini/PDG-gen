import java.util.Scanner;


public class Main {
    public static void main(String args[])  {
        Scanner sc=new Scanner(System.in);

        long n=sc.nextLong();
        char a[]=new char[27];
        for(int i=0;i<26;++i)
            a[i+1]=(char)(i+'a');
        a[0]='z';
        StringBuffer sb=new StringBuffer();
        long pp=1;
        while(pp<=n)
            pp*=26;
        pp/=26;
        while(n>26) {
            long p=n/pp;
            sb.append(a[(int)p]);
            n=n%pp;
            pp/=26;
        }
        System.out.println(sb.toString()+a[(int)n]);
    }
}
