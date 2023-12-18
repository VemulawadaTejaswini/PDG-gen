import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int l = 0;
        int r = 0;
        int sl = 0;
        int sr = 0;
        int rev = 0;
        for (int i=0; i<n; i++) {
            char[] arr = sc.next().toCharArray();
            for (int j=0; j<arr.length; j++) {
                if (arr[j] == '(') l++;
                else r++;
            }
            if (arr[0] == ')' && arr[arr.length-1] == '(') rev++;
            if (arr[0] == '(') sl++;
            else if (arr[arr.length-1] == ')') sr++;
        }

        if (l != r) {
            System.out.println("No");
            return;
        }

        if (rev <= sl && rev <= sr) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }

}
