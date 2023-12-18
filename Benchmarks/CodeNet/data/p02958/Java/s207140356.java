import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        int P[];

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            P = new int[N];
            for(int i =0;i < N;i++){
                P[i] = sc.nextInt();
            }
        }
        int cnt = 0;;
        for(int i =0;i < P.length;i++){
            if(i+1 != P[i]){
                cnt++;
            }
        }

        if(cnt ==2 ||cnt ==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        return;
    }
}
