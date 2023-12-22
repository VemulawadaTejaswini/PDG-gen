import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(factrial(n));
    }
    static long factrial(Long n){
        if(n==0)return 1;
        return n*factrial(n-1);
    }
}