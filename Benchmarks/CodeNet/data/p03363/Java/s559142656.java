import java.util.*;
public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ruiseki = new int[N+1];


        for (int i = 0; i < N ; i++) {
            int num = sc.nextInt();
            ruiseki[i+1] = ruiseki[i]+num;
        }

        int ans = 0;
        for (int i = 0; i < ruiseki.length ; i++) {
            for (int j = i+1; j < ruiseki.length ; j++) {
                if(ruiseki[j]-ruiseki[i]==0) ans++;
            }
        }

        System.out.println(ans);

    }
}