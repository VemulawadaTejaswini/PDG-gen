import java.util.Scanner;

public class Main {

    public static long solve(long x){
        if (x == 0){
            return 2;
        }
        else if (x == 1){
            return 1;
        }
        else{
            return solve(x-1) + solve(x-2);
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long s = in.nextLong();
        System.out.println(solve(s));
    }
}