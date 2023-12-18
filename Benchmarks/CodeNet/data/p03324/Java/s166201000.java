import java.util.*;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    static int N;
    static int A;
    static long B;
    static long C;
    static int[] map = new int[1000000];
    static int min = 9994999;




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int N = scanner.nextInt();

        long A = scanner.nextInt();
        long B = scanner.nextInt();

        if(A == 0){
            if(B >= 100) {
                System.out.println(101);
            }else
            System.out.println(B);
        }else if(A == 1){
            if(B == 10000){
                System.out.println(100100);
            }else{
                System.out.println(B * 100);
            }
        }else{
            if(B == 1000000){
                System.out.println(10010000);
            }else {
                System.out.println(B * 10000);
            }
        }

    }

}

