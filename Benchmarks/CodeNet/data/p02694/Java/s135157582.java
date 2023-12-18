import java.lang.Math;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double interest = 100;
        int year = 0;
        while (interest < n){
            year += 1;
            interest = interest * 1.01;
            Math.floor(interest);
            
            if (interest == n){
                break;
            }
        }

        System.out.println(year);
    }
}

        

        



