import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        char[] arr = sc.next().toCharArray();

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == '?') {
                if (i==0) {
                    arr[0] = 'D';
                } else if (i==arr.length-1) {
                    arr[arr.length-1] = 'D';
                } else {
                    if (arr[i+1]=='D') {
                        arr[i] = 'P';
                    } else {
                        arr[i] = 'D';
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<arr.length; i++) {
            sb.append(arr[i]);
        }

        System.out.println(sb.toString());


    }
}