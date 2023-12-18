import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double sum = a + b;
        double count = 0;
        if(a == 0){
            System.out.println(0);
        }
        double num = n / sum;
        count = num * a;
        double c = n % sum;
        if(c < a){
            count = count + c;
        }else {
            count = count + a;
        }
        System.out.println(count);
    }

}