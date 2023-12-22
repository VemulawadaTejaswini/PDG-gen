import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();

        int cntW = 0;
        int cntR = 0;
        for (int i=0; i< arr.length; i++) {
            if (arr[i] == 'W') cntW++;
            else cntR++;
        }

//        System.out.println(cntW);
//        System.out.println(cntR);

        int res = 0;
        for (int i=0; i<cntR; i++) {
            if (arr[i] == 'W') res++;
        }

        System.out.println(res);


    }

}

