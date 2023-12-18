import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();

        int x = 0;
        int M = 0;
        for(int i = 0; i < N; i++){
            if(S.charAt(i) == 'I'){
                x++;
            }else{
                x--;
            }
            if(x > M) M = x;
        }

        System.out.println(M);
    }
}