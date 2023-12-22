
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long a = 0, b = -1;
        boolean flag = false;
        while(!flag){
            b++;
            if(b != 0 && x % b != 0){
                continue;
            }
            for(a = 0;;a++) {
                long l = a*a*a*a*a-b*b*b*b*b;
                if (l == x){
                    flag = true;
                    break;
                }else if(l > x){
                    break;
                }
            }
            for(a = 0;;a++) {
                long l = a*a*a*a*a+b*b*b*b*b;
                if (l == x){
                    flag = true;
                    b = -b;
                    break;
                }else if(l > x){
                    break;
                }
            }
        }
        System.out.println(a + " " + b);
    }
}
