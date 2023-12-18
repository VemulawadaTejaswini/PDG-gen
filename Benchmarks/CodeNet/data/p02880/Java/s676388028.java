import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void run(){
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        //素因数を列挙する
        List<Integer> L = new ArrayList<Integer>();
        for (int i = 2; i <= N; i++){
            //Nで割り切れる数を見つけたら、Nから
            while(N % i == 0){
                L.add(i);
                N /= i;
            }
        }
        //素因数を小さい方に割り当てていく
        int A = 1, B = 1;
        for(int i : L){
            if(A <= B) A *= i;
            else B *= i;
        }
        if(A <= 9 && B <= 9) System.out.println("Yes");
        else System.out.println("No");

    }
}
