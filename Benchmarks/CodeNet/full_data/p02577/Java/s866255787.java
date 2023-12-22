import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        long[] a = new long[n.length()];
        int ans = 0;
        for(int p = 0; p < n.length(); p++){
            a[p] = Long.parseLong(String.valueOf(n.charAt(p)));
            ans += a[p];
        }
        if(ans % 9 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}