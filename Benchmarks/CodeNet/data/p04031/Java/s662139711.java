import java.util.*;
public class Main {

    public static void main(String __[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int equal_checker = 1;
        double total = 0;
        int total_cost = 0;
        for(int x = 0; x<N; x++){
            a[x]= sc.nextInt();
            total += a[x];
            if(x > 0 && a[x-1] == a[x]){
                ++equal_checker;
            }
        }

        if(equal_checker == N){
            System.out.println(total_cost);
        } else {
            int equal_integer = (int)(Math.ceil(total / N));
            for(int y : a){
                if(y != equal_integer)
                total_cost += Math.pow((y- equal_integer),2);
            }
            System.out.println(total_cost);
        }
    }
}
