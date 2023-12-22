import java.util.Scanner;
class AC_171_C {
    public static void main(String args[])  {
        Scanner sc=new Scanner(System.in);

        long n=sc.nextLong();
        char a[]=new char[27];
        for(int i=1;i<=26;++i)
            a[i]=(char)(i-1+'a');
        StringBuffer sb=new StringBuffer();
        while(n>0) {
            long p=n%26;
            sb.append(a[(int)p]);
            n/=26;
        }
        System.out.println(sb.reverse().toString());
    }
}
