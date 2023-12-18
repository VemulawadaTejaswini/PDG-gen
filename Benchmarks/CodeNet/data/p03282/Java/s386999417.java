import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

    static long N;
//    static int M;
    static int A;
    static long B;
    static long C;
    //    static int[][] map;
    static int min = 9999999;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        Long M = scanner.nextLong();

        if(s.charAt(0) != '1'){
            System.out.println(s.charAt(0));
        }else{
            for (int i = 0; i < s.length(); i++) {
                if(i == M - 1){
                    System.out.println(s.charAt(i));
                    break;
                }
                if(s.charAt(i) != '1'){
                    System.out.println(s.charAt(i));
                    break;
                }
            }


        }

    }
}

