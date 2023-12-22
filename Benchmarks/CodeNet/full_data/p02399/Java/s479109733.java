import java.util.Scanner;
class Main{
    public static void main(String[] av){
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int d,r;
        double f;
        d=a/b;
        r=a%b;
        f=(double)a/b;
        System.out.println(d+" "+r+" "+String.format("%.6f",f));
    }
}
