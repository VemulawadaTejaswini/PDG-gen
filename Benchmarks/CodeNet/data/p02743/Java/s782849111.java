import java.util.*;

public class Main {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if ((c-a-b)*(c-a-b)-4*a*b>0) {
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }


    }
}

