import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int position = 0;
        int kaisu = 1;

        for (int i=0; i < n-1; i++) {
            int l = sc.nextInt();
            position += l;
            if(position <= x) {
                kaisu += 1;
            }
        }

        System.out.println(kaisu);

        sc.close();
    }
} 