import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        long a, b, c;
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();

        long a_calc = 0;
        long b_calc = 0;
        long c_calc = 0;
        long min = 0;

        if (a%2 == 0 || b%2 == 0 || c%2 == 0){
            System.out.println(min);
        }else{
            a_calc = b*c;
            b_calc = a*c;
            c_calc = a*b;

            min = a_calc;
            if(min > b_calc)min = b_calc;
            if(min > c_calc)min = c_calc;
            System.out.println(min);
        }

    }
}