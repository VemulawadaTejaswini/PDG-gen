import java.util.Scanner;

class Main{
    public static int gcd(int a, int b){
        int t;
        if(a < b){
            t = a;
            a = b;
            b = t;
        }
        while(b > 0){
            t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(gcd(a, b) + " " + a / gcd(a, b) * b);
        }
    }
}