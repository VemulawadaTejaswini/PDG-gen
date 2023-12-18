import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < 2 || b < 2 || c < 2 || a > 1000000000 || b > 1000000000 || c > 1000000000) {
            return;
        }



int v1 = a/2;

int v2 = a - v1;

int blue = v1*b*c;
int red = v2*b*c;

int diff = blue-red;
        
        

        if (diff < 0) {
            diff = diff * (-1);
        }
        


        System.out.println(diff);
    }

}