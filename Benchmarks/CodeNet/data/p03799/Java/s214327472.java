import java.util.Scanner;

class Main{
    static Scanner scan=new Scanner(System.in);
    public static void main(String args[]){
        long n=scan.nextLong();
        long m=scan.nextLong();

        long x=n*2+m;
        System.out.println(x/4);
    }
}