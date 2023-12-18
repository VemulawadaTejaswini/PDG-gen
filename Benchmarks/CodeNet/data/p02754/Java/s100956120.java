import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        long n = stdIn.nextLong();
        long a = stdIn.nextLong();
        long b = stdIn.nextLong();

        if(n%(a+b) < a){
            System.out.println((n/(a+b)*a)+(n%(a+b)));
        }else{
            System.out.println((n/(a+b)*a)+a);
        }
    }
}