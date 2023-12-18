import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ret = n, s = 0;
        for(int i=0;i<8;i++){
            s += ret % 10;
            ret /= 10;
        }
        if(n % s == 0){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
