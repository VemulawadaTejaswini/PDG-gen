import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;
        for(int i = 0; i < N; i++){
            int c = sc.nextInt();
            if(c <= A) x++;
            else if(c > A && c <= B) y++;
            else z++;
        }
        int ans = Math.min(x, Math.min(y, z));
        System.out.println(ans);
        sc.close();

    }

}
