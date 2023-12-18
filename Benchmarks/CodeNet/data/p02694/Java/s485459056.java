import java.lang.Math;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double interest = 100.0;
        int year = 0;
        while (true){
            interest = interest * 1.01;
            Math.floor(interest);
            year += 1;
            if (interest == n){
                break;
            }
        }

        System.out.println(year);
    }
}

        

        



