import java.util.Scanner;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        if(n == 100000) {
            System.out.println(9+900+90000);
        }else if(n >= 10000){
            System.out.println(909+(n-10000+1));
        }else if(n >= 1000) {
            System.out.println(909);
        }else if(n >= 100) {
            System.out.println(9+(n-100+1));
        }else if(n >= 10) {
            System.out.println(9);
        }else {
            System.out.println(n);
        }
    }

}