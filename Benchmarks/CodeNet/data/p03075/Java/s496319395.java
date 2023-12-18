import java.util.Scanner;

final class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);

        int a, b, c, d, e, k;

        a = stdIn.nextInt();
        b = stdIn.nextInt();
        c = stdIn.nextInt();
        d = stdIn.nextInt();
        e = stdIn.nextInt();
        k = stdIn.nextInt();

        if(e-a <= k){
            System.out.print("Yay!");
        }else{
            System.out.print(":(");
        }
    }
}