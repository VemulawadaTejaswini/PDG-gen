import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] params = in.nextLine().split(" ");

        long child = 1;
        int[] as = new int[n];
        for( int i = 0 ; i < n ; i++ ){
            as[i] = Integer.parseInt(params[i]);
            child *= as[i];
        }
        long parent = 0;

        for( int i = 0 ; i < n ; i ++ ){
            parent += child / as[i];
        }

        for( long i = 2 ; i < child ; i++ ){
            while(true){
                if( child % i == 0 && parent % i == 0 ){
                    child /= i;
                    parent /= i;
                }
                else {
                    break;
                }
            }
        }

        System.out.println( (double)child/parent );

    }

}