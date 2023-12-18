import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int R = scan.nextInt();

        int result = 999999999;
        int min = 999999999;

        for(int i =L; i < R; i++ ){
            for(int j = L+1; j <= R; j++ ){

                result = (i * j) % 2019;

                if( result < min ){

                    min = result;
                }

                if(min == 0){

                    System.out.println(0);
                    return;

                }
            }
        }

        System.out.println(min);

    }
}