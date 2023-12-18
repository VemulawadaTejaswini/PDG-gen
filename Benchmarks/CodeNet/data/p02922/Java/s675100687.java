
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        int res = 1;
        int now = a;
        while(now < b){
            now += (a-1);
            res++;
        }
        System.out.println(res);
    }
}