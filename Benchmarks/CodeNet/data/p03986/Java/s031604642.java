import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] x = sc.next().toCharArray();
        int lastT = 0;
        for (int i = 0; i < x.length; i++) {
            if(x[i] == 'T') lastT = i+1;
        }
        System.out.println((x.length - lastT) * 2);
        sc.close();

    }

}
