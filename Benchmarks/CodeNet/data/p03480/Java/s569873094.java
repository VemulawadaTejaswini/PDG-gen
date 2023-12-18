import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int imput = sc.nextInt();
        String string = String.valueOf(imput);
        String[] ar = string.split("");
        int ans = 0;
        for (int i = 0; i <= ar.length - 1; i++) {
            if (ar[i].equals("0")) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}