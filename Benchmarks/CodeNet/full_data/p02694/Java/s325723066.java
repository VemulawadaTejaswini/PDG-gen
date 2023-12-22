import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        long p=100;
        long yr=0;
        long balance=p;
        while(balance<x)
        {
            long temp=balance/100;
            balance+=temp;
            yr++;
        }
        System.out.println(yr);
    }
}