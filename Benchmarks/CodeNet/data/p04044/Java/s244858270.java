
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        in.nextLine();
        String[] a = new String[n];
        //inputs
        for (int i = 0; i <a.length ; i++) {
            a[i]=in.nextLine();
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    String tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }

        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);
        }




    }
}