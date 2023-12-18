import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        int R = 100;

        if(D == 0){
            System.out.println(N);
        }else if(D == 1){
            System.out.println(N * 100);
        }else{
            System.out.println(N *10000);
        }
    }
}
    