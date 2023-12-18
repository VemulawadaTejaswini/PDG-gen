import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

    static int N;
    static int M;
    static int A;
    static long B;
    static long C;
//    static int[][] map;
    static int min = 9999999;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();
        
        if(N % M == 0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }


    }




}

