
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int a = 0, b = 0;
        int i = -1;
        while(a == 0 && b == 0){
            i++;
            double A = Math.pow(x + i*i*i*i*i, 0.2);
            if(A == Math.floor(A)){
                a = (int)A;
                b = i;
            }
            double A_ = Math.pow(x - i*i*i*i*i, 0.2);
            if(A_ == Math.floor(A_)){
                a = (int)A_;
                b = -i;
            }
        }
        System.out.println(a + " " + b);
    }
}
