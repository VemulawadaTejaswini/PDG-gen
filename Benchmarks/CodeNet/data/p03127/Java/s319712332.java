import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        try{
            //入力
            int N = scan.nextInt();
            int[] A_ = new int[N];
            for(int i = 0; i < N; i++){
                A_[i] = scan.nextInt();
            }

            int g = A_[0];
            for(int i = 1; i < N; i++){
                g = gcd(g,A_[i]);
            }
            System.out.println(g);

        }finally{
            scan.close();
        }
    }

    //最大公約数を求める
    static int gcd(int a, int b){
        if(a < b){
            int tmp = b;
            b = a;
            a = tmp;
        }
        while(a % b != 0){
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return b;
    }
}
