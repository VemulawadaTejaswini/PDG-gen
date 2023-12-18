import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt ();
        int b = in.nextInt ();
        int k = in.nextInt ();
        int remA = a-k;
        if (remA<0)
            remA=0;
        int remB = a+b - k;
        if(remB>b)
            remB=b;
        System.out.println (remA+" "+ remB);
    }
}