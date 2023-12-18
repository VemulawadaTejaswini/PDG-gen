import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        HashSet<Integer> set = new HashSet<Integer>();
//        int AStart = 0;
//        if ((A%0.08) == 0){
//            AStart = (int) (A/0.08);
//        } else {
//            AStart = (int) (A/0.08) + 1;
//        }
//        int BStart = 0;
//        if ((B%0.1) == 0){
//            BStart = (int) (B/0.1);
//        } else {
//            BStart = (int) (B/0.1) + 1;
//        }
        for (int i = (int) (Math.ceil(A/0.08)); i < (int) (Math.ceil((A+1)/0.08)); i++){
//            System.out.println(i);
            set.add(i);
        }

        for (int i = (int) (Math.ceil(B/0.1)); i < (int) (Math.ceil((B+1)/0.1)); i++){
//            System.out.println(i);
            if (set.contains(i)){
                System.out.println(i);
                System.exit(0);
            }
        }

        System.out.println("-1");

    }
}