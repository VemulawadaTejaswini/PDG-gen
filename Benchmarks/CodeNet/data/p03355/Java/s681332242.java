import java.util.*;

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
        String s = scanner.nextLine();

        ArrayList<String> sss = new ArrayList<>();

        N = scanner.nextInt();


        for (int i = 0; i <= s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                if(sss.indexOf(s.substring(i, j) ) < 0){
                    sss.add(s.substring(i, j));
//                    System.out.println(s.substring(i,j));
                }
            }
        }

        Collections.sort(sss);

        System.out.println(sss.get(N));
    }



}

