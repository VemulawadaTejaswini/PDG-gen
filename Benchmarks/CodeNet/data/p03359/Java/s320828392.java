import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    static int N;
    static long A;
    static long B;
    static long C;
    static int[] map;



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        A = scanner.nextInt();
        B = scanner.nextInt();

        int ans = 0;

        if(A > B){
            A--;
        }

        System.out.println(A);


//        if(ans == 0){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }


    }

}

