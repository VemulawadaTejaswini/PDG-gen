import java.util.Scanner;

class Main{
    static Scanner scan=new Scanner(System.in);
    public static void main(String args[]){
        long n=scan.nextLong();
        long m=scan.nextLong();

        long x=n*2+m;
        if(n<=m)System.out.println(x/4);
        else System.out.println(m/2);
    }
}