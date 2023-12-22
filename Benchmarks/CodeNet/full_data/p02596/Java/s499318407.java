import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long k = scan.nextLong();
        boolean goal = true;
        long c = 0;
        long x = 0;
        if(k % 2 == 0){
            System.out.println("-1");
            goal = false;
        }
        while (goal){
            x += Math.pow(10 , c)*7;
            if(x % k == 0){
                System.out.println(c + 1);
                goal = false;
            }else {
                c += 1;
            }
        }
    }
}
